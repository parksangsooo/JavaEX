package com.javaex.io.bytestream;

import java.io.*;
import java.util.Arrays;

public class ByteArrayStreamEx_ {
    public static void main(String[] args) {
        // 입력소스
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // 출력타겟
        byte[] outSrc = null;
        System.out.println("입력소스: " + Arrays.toString(inSrc));
        System.out.println("--------------------");

        // AutoCloseable -> 자동 자원 해제
        // Autocloseable 을 활용한 예외 처리 : try - with - resources

        try (   // 자원 해제를 필요로 하는 객체를 초기화 함
                InputStream bis = new ByteArrayInputStream(inSrc);
                OutputStream bos = new ByteArrayOutputStream();
                ){
            int data = 0; // 입력 스트림으로부터 입력된 데이터 저장할 변수

            while ((data = bis.read()) != -1){
                System.out.println("Read data: " + data);
                bos.write(data);
            }
            outSrc = ((ByteArrayOutputStream)bos).toByteArray();
            System.out.println("최종결과: " + Arrays.toString(outSrc));
        } catch (IOException e){
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}