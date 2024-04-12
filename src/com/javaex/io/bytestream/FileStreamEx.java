package com.javaex.io.bytestream;

import java.io.*;

public class FileStreamEx {
    private static String rootPath = System.getProperty("user.dir") + "\\files\\";
    private static String source = rootPath + "img.jpg";
    private static String target = rootPath + "img_copy.jpg";

    public static void main(String[] args) {
        System.out.println("Root Path: " + rootPath);
        System.out.println("원본파일: " + source);
        System.out.println("타겟파일: " + target);

        // 스트림을 열고
        try (
                InputStream fis = new FileInputStream(source);          // 입력스트림
                OutputStream fos = new FileOutputStream(target);        // 출력 스트림
        )
        {
            // 입력 데이터 변수를 만들고
            int data = 0;

            // 루프를 돌면서 데이터를 읽어오고, 아웃풋 스트림으로 출력을 해야함.
            // 더 읽을 데이터가 없으면 -1
            while ((data = fis.read()) != -1){
                fos.write(data);
                System.out.println("data: " + data);
                // System.out.println(".");
            }
            System.out.println("파일을 복사했어요.");
        } catch (FileNotFoundException e) {
            System.err.println("파일을 찾지 못했어요.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
