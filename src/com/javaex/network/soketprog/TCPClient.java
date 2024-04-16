package com.javaex.network.soketprog;

import java.io.*;
import java.net.Socket;

import static com.javaex.network.soketprog.TCPServer.PORT_NO;
import static com.javaex.network.soketprog.TCPServer.SERVER_IP;

public class TCPClient {

    /*
    - 양쪽 모두 실행하여 각 탭에서 출력 확인
    - 클라이언트는 전송하고 끝
    - 서버는 계속 돌아가도록 되어있는 점 확인
     */

    public static String lyric = "" +
            "검푸른 파도속으로 눈물을 묻었지\n" +
            "바위산 계곡을 따라 외로움 잊었지\n" +
            "강한것은 아름다워 타오르는 태양처럼\n" +
            "강한것은 아름다워 변함없는 바위처럼\n" +
            "불타는 노을 보면서 고개를 들었지\n" +
            "눈물의 세월 모두다 저 멀리 던졌지\n" +
            "강한것은 아름다워 타오르는 태양처럼\n" +
            "강한것은 아름다워 변함없는 바위처럼\n" +
            "외인구단 외인구단 태양 이어라\n" +
            "외인구단 외인구단 바위 되어라";
    public static void main(String[] args) {

        try (
                //  💡 서버 연결에 사용할 소켓
                Socket socket = new Socket(SERVER_IP, PORT_NO);

                //  💡 서버로 보낼 스트림
                OutputStream os = socket.getOutputStream();
                PrintWriter pw = new PrintWriter(os, true); // ⭐️ autoflush

                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
        ) {
            for (String line : lyric.split("\n")) {
                pw.println(line);
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
