package com.javaex.network.echoserver;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

// 이 클래스는 각 클라이언트에 대한 처리를 별도의 스레드로 실행하기 위한 클래스입니다.
public class ServerThread extends Thread {
    private Socket socket;  // 클라이언트와 통신하기 위한 소켓

    public ServerThread(Socket socket) {
        this.socket = socket;  // 생성자를 통해 전달받은 클라이언트 소켓
    }

    @Override
    public void run() {
        try {
            // 클라이언트의 IP와 포트 정보를 로깅합니다.
            InetSocketAddress socketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
            String clientInfo = socketAddress.getAddress() + ":" + socketAddress.getPort();
            System.out.println("[클라이언트 " + clientInfo + "가 연결되었습니다.]");

            // 클라이언트로부터 메시지 수신을 위한 입력 스트림을 준비합니다.
            InputStream is = socket.getInputStream();
            Reader isr = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            // 클라이언트에게 메시지를 Echo Back하기 위한 출력 스트림을 준비합니다.
            OutputStream os = socket.getOutputStream();
            Writer osw = new OutputStreamWriter(os, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);

            String msg;  // 수신된 메시지를 저장할 변수
            while (true) {
                msg = br.readLine();  // 클라이언트로부터 한 줄의 메시지를 읽습니다.
                if (msg == null) {
                    System.out.println("[클라이언트 " + clientInfo + "의 연결이 종료되었습니다.]");
                    break;  // 클라이언트가 연결을 종료하면 반복문을 빠져나옵니다.
                }
                System.out.println(clientInfo + ": " + msg);  // 로깅: 클라이언트에서 받은 메시지를 출력합니다.

                // Echo Back: 받은 메시지를 그대로 클라이언트에게 다시 보냅니다.
                bw.write("[Echo]: " + msg);
                bw.newLine();
                bw.flush();
            }

            // 리소스 정리: 스트림과 소켓을 닫습니다.
            bw.close();
            br.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();  // 예외 발생 시 스택 트레이스를 출력합니다.
        }
    }
}
