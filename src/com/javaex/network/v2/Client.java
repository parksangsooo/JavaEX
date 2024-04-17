package com.javaex.network.v2;

import java.io.*;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Socket socket = null;  // 서버와 통신을 위한 Socket 선언

        try {
            socket = new Socket();  // Socket 객체 생성
            System.out.println("<클라이언트가 시작되었습니다.>");  // 시작 메시지 출력
            System.out.println("[연결을 요청합니다.]");  // 연결 요청 메시지 출력

            // 서버의 IP 주소와 포트 번호로 연결 시도
            InetSocketAddress serverSocket = new InetSocketAddress("127.0.0.1", 10000);
            socket.connect(serverSocket);  // 서버에 연결

            System.out.println("[서버에 연결되었습니다.]");  // 서버 연결 성공 메시지 출력

            // 메시지를 서버로 보내기 위한 OutputStream 준비
            OutputStream os = socket.getOutputStream();
            Writer osw = new OutputStreamWriter(os, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);

            // 서버로부터 메시지를 받기 위한 InputStream 준비
            InputStream is = socket.getInputStream();
            Reader isr = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            Scanner sc = new Scanner(System.in);  // 사용자 입력을 받기 위한 Scanner 객체
            while (true) {
                String msg = sc.nextLine();  // 사용자로부터 한 줄 입력 받음
                if(msg.equals("/q")){  // 입력받은 메시지가 "/q"일 경우
                    System.out.println("접속을 종료합니다.");  // 종료 메시지 출력
                    break;  // while 반복문 종료
                }
                bw.write(msg);  // 입력받은 메시지를 서버로 전송
                bw.newLine();  // 새로운 줄 추가
                bw.flush();  // 버퍼의 내용을 즉시 전송
                System.out.println("전송메세지: " + msg);  // 콘솔에 전송한 메시지 출력

                String rcvMsg = br.readLine();  // 서버로부터 에코 받은 메시지 읽기
                System.out.println("수신메세지: " + rcvMsg);  // 콘솔에 에코 받은 메시지 출력
            }
            sc.close();  // Scanner 객체 닫기
            bw.close();  // BufferedWriter 객체 닫기
            br.close();  // BufferedReader 객체 닫기

            System.out.println("<클라이언트 종료>");  // 종료 메시지 출력
        } catch (ConnectException e) {
            System.err.println("접속이 거부되었습니다.");  // 연결 거부 오류 메시지 출력
        } catch (IOException e) {
            e.printStackTrace();  // 예외 정보 출력
        } finally {
            try {
                socket.close();  // Socket 닫기
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
