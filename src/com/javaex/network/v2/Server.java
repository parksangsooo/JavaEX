package com.javaex.network.v2;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket socket = null;

        try {
            socket = new ServerSocket();
            InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000);
            socket.bind(local);

            System.out.println("<서버가 시작되었습니다.>");
            System.out.println("[연결을 기다립니다.]");

            // 클라이언트로부터 연결 요청을 수락합니다.
            Socket clientSocket = socket.accept();

            // 연결된 클라이언트의 IP 주소와 포트 정보를 출력합니다.
            InetSocketAddress socketAddress = (InetSocketAddress) clientSocket.getRemoteSocketAddress();
            System.out.println("[클라이언트가 연결되었습니다.]");
            System.out.println(socketAddress.getAddress() + ": " + socketAddress.getPort());

            // 클라이언트로부터 데이터를 받기 위한 InputStream을 설정합니다.
            InputStream is = clientSocket.getInputStream();
            Reader isr = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            // 클라이언트에게 데이터를 Echo Back 하기 위한 OutputStream을 설정합니다.
            OutputStream os = clientSocket.getOutputStream();
            Writer osw = new OutputStreamWriter(os, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);

            // 클라이언트로부터 메시지를 받아서 그 메시지를 다시 클라이언트로 Echo Back 합니다.
            String msg;
            while (true) {
                msg = br.readLine();  // 클라이언트로부터 한 줄의 문자를 읽습니다.

                if (msg == null) {  // 메시지가 더 이상 없으면 종료합니다.
                    System.out.println("[더 읽어들일 데이터가 없어 종료합니다.]");
                    break;
                }
                System.out.println("메세지: " + msg);  // 서버 콘솔에 메시지를 출력합니다.
                // Echo Back
                System.out.println("Echo Back: " + msg);  // Echo Back할 메시지를 출력합니다.
                bw.write("[Echo]: " + msg);  // 클라이언트로 Echo 메시지를 보냅니다.
                bw.newLine();  // 줄바꿈 문자를 추가합니다.
                bw.flush();  // 출력 버퍼를 비워 즉시 메시지를 전송합니다.
            }
            bw.close();
            br.close();

            System.out.println(" ----------------- ");
            System.out.println("<서버 종료>");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
