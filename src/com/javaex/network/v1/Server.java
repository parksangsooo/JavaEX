package com.javaex.network.v1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        // 서버 소켓 생성: 서버에서 클라이언트의 연결 요청을 기다리는 '전화기'와 같습니다.
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(); // 서버 소켓 인스턴스 생성
            InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000); // 서버의 IP 주소와 포트 설정
            serverSocket.bind(local); // 설정된 주소와 포트에 서버 소켓을 바인딩합니다. 마치 우리 가게의 위치를 정하는 것과 같습니다.

            System.out.println("<서버가 시작되었습니다.>"); // 서버 시작 메시지 출력
            System.out.println("[연결을 기다립니다.]"); // 클라이언트 연결 대기 메시지 출력

            // 클라이언트의 연결을 기다림: 마치 누군가 전화를 걸기를 기다리는 것과 같습니다.
            Socket clientSocket = serverSocket.accept(); // 클라이언트 연결 수락

            // 클라이언트 접속 정보 출력
            // 클라이언트의 연결 요청이 수락되면, 클라이언트의 정보를 가져옵니다.
            // 💡 InetSocketAddress 클래스는 네트워크 주소(IP와 포트)를 캡슐화합니다.
            InetSocketAddress socketAddress = (InetSocketAddress) clientSocket.getRemoteSocketAddress();
            System.out.println("[클라이언트가 연결되었습니다.]"); // 클라이언트 연결 성공 메시지 출력

            // 클라이언트의 IP 주소와 포트 번호를 출력합니다.
            // socketAddress.getAddress(): 클라이언트의 IP 주소를 반환합니다.
            // socketAddress.getPort(): 클라이언트가 사용하는 포트 번호를 반환합니다.
            System.out.println(socketAddress.getAddress() + ": " + socketAddress.getPort());

            System.out.println(" ----------------- ");
            System.out.println("<서버 종료>"); // 서버 종료 메시지 출력
        } catch (IOException e) {
            e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
        } finally {
            try {
                serverSocket.close(); // 서버 소켓을 닫습니다. 마치 가게 문을 닫는 것과 같습니다.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
