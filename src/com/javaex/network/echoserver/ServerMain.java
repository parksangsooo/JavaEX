package com.javaex.network.echoserver;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
이 코드는 서버가 클라이언트의 연결을 지속적으로 수락하고 각 연결에 대해 새로운 스레드(ServerThread)를 생성하여 독립적으로 처리할 수 있도록 구성되어 있습니다.
서버는 지정된 IP 주소와 포트 번호를 사용하여 네트워크 인터페이스에 바인딩되고, 연결 요청을 무한히 대기하는 구조입니다.
클라이언트가 연결되면 해당 클라이언트에 대한 처리를 ServerThread 인스턴스에 위임하여 각 클라이언트 요청을 병렬로 처리할 수 있게 합니다.
 */

public class ServerMain {
    public static void main(String[] args) {
        ServerSocket socket = null;  // 서버 소켓을 위한 변수 선언

        try {
            socket = new ServerSocket();  // 서버 소켓 객체 생성
            // IP 주소와 포트 번호를 바인딩. 여기서는 모든 IP에서 접속 가능하게 설정합니다.
            InetSocketAddress bindIp = new InetSocketAddress("0.0.0.0", 10000);
            socket.bind(bindIp);  // 바인딩된 IP 주소와 포트로 서버 소켓 설정

            System.out.println("<서버 시작>");  // 서버 시작 메시지 출력
            System.out.println("[연결을 기다려요.]");  // 연결 대기 메시지 출력

            // 클라이언트의 연결을 무한히 대기합니다.
            while (true) {
                Socket clientSocket = socket.accept();  // 클라이언트의 연결을 수락하고 소켓 반환
                Thread thread = new ServerThread(clientSocket);  // 새로운 클라이언트를 처리할 스레드 생성
                thread.start();  // 스레드 시작, 클라이언트별로 독립적으로 메시지 처리
            }

        } catch (IOException e) {
            e.printStackTrace();  // IO 예외 발생 시 오류 내용 출력
        } finally {
            try {
                if (socket != null) socket.close();  // 서버 소켓을 닫아 자원 해제
            } catch (IOException e) {
                e.printStackTrace();  // 소켓 닫기 실패 시 오류 출력
            }
        }
    }
}
