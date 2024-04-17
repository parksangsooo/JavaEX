package com.javaex.network.v1;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        // 클라이언트 소켓 생성: 서버에 연결하기 위한 '전화기'와 같습니다.
        Socket socket = null;

        try {
            socket = new Socket(); // 소켓 인스턴스 생성
            System.out.println("<클라이언트가 시작되었습니다.>"); // 클라이언트 시작 메시지 출력
            System.out.println("[연결을 요청합니다.]"); // 연결 요청 메시지 출력

            // 서버에 연결 시도: 마치 전화번호를 눌러 전화를 거는 것과 같습니다.
            InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
            socket.connect(remote); // 설정된 서버 주소와 포트에 연결 시도

            System.out.println("[서버에 연결되었습니다.]"); // 서버 연결 성공 메시지 출력
            System.out.println("<클라이언트 종료>"); // 클라이언트 종료 메시지 출력
        } catch (ConnectException e) {
            System.err.println("접속이 거부되었습니다."); // 연결 실패 메시지 출력
        } catch (IOException e) {
            e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
        } finally {
            try {
                socket.close(); // 소켓을 닫습니다. 마치 전화를 끊는 것과 같습니다.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
