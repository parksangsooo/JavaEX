package com.javaex.network.echoserver;

import java.io.*;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Socket socket = null;  // 서버와의 네트워크 통신을 위한 소켓 객체

        try {
            socket = new Socket();  // 소켓 인스턴스를 생성합니다.
            System.out.println("<클라이언트가 시작되었습니다.>");
            System.out.println("[연결을 요청합니다.]");

            // 서버의 IP 주소와 포트 번호를 사용하여 연결을 시도합니다.
            InetSocketAddress serverSocket = new InetSocketAddress("192.168.0.49", 10000);
            socket.connect(serverSocket);  // 서버에 연결을 시도하고 성공하면 진행됩니다.
            System.out.println("[서버에 연결되었습니다.]");

            // 서버로 메시지를 보내기 위한 OutputStream을 설정합니다.
            OutputStream os = socket.getOutputStream();
            Writer osw = new OutputStreamWriter(os, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);

            // 서버로부터 메시지를 수신하기 위한 InputStream을 설정합니다.
            InputStream is = socket.getInputStream();
            Reader isr = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            Scanner sc = new Scanner(System.in);  // 사용자로부터 입력을 받기 위해 Scanner 객체를 사용합니다.
            while (true) {
                String msg = sc.nextLine();  // 사용자 입력을 한 줄씩 받습니다.
                if (msg.equals("/q")) {  // 입력받은 메시지가 종료 명령("/q")인 경우
                    System.out.println("접속을 종료합니다.");
                    break;  // 반복문을 종료하고 프로그램을 종료합니다.
                }
                bw.write(msg);  // 입력받은 메시지를 서버로 전송합니다.
                bw.newLine();  // 줄바꿈 문자를 추가하여 메시지의 끝을 나타냅니다.
                bw.flush();  // 스트림을 플러시하여 메시지를 즉시 전송합니다.
                System.out.println("전송메세지: " + msg);

                String rcvMsg = br.readLine();  // 서버로부터 응답 받은 메시지를 읽습니다.
                System.out.println("수신메세지: " + rcvMsg);  // 응답 받은 메시지를 출력합니다.
            }
            sc.close();  // 사용한 리소스를 닫습니다.
            bw.close();
            br.close();

            System.out.println("<클라이언트 종료>");
        } catch (ConnectException e) {
            System.err.println("접속이 거부되었습니다.");  // 연결 실패 시 오류 메시지를 출력합니다.
        } catch (IOException e) {
            e.printStackTrace();  // 기타 I/O 예외가 발생한 경우 스택 트레이스를 출력합니다.
        } finally {
            try {
                socket.close();  // 최종적으로 소켓을 닫아 자원을 해제합니다.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
