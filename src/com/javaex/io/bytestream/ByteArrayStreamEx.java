package com.javaex.io.bytestream;

import java.io.*;
import java.util.Arrays;

public class ByteArrayStreamEx {
    public static void main(String[] args) {
        // 입력소스
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // 출력타겟
        byte[] outSrc = null;
        System.out.println("입력소스: " + Arrays.toString(inSrc));
        System.out.println("--------------------");
        
        // 전통적 방식의 입출력 스트림 예외 처리
        // AutoCloseable -> 자동 자원 해제
        InputStream bis = null;         // 입력 스트림 선언 상위 클래스
        OutputStream bos = null;        // 출력 스트림 선언 상위 클래스


        // try - with - resource
        try {
            // 입력 스트림과 출력 스트림 열기
            bis = new ByteArrayInputStream(inSrc);      // InputStream 은 추상클래스 abstract 를 상속받은 ByteArrayInputStream
            bos = new ByteArrayOutputStream();         // 선언만 함

            int data = 0;       // 입력 스트림으로부터 넘어올 데이터 저장 변수
            while ((data = bis.read()) != -1) {      // -1 이면 더이상 읽을 데이터가 없을 때 까지
                System.out.println("Read data: " + data);
                bos.write(data);
            }

            outSrc = ((ByteArrayOutputStream)bos).toByteArray();
            System.out.println("최종결과: " + Arrays.toString(outSrc));

        } catch (IOException e) {       // IOException 처리
            e.printStackTrace();
        } catch (Exception e) {         // 혹시 남아 있을 잔여 예외 처리
            e.printStackTrace();
        }finally {
         /*   if (bis != null) {
                try {
                    bis.close();
                } catch (Exception e) {

                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (Exception e) {

                }*/
            try {
                bis.close();
                bos.close();
            } catch (Exception e){

            }
        }
    }
}
