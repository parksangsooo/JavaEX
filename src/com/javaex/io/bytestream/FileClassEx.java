package com.javaex.io.bytestream;

import java.io.File;

public class FileClassEx {
    // files 의 경로 (실제) 위치
    private static String rootPath = System.getProperty("user.dir") + "\\files";

    public static void main(String[] args) {
        System.out.println("루트경로: " + rootPath);

        // 파일객체 생성
        File f = new File(rootPath);        // 파일 명으로 파일 정보 객체 생성
        System.out.println(rootPath + ":" + (f.exists() ? "존재" : "없음"));
    }

    private static void printFileInfo(File f) {
        System.out.println("------------");

        // 전달 받은 파일 객체가 디렉터리 인가?
        if (f.isDirectory()) {       // 디렉터리면 목록 출력
            System.out.println("디렉터리: " + f.getName());

            // 파일 목록 가져오기
            File[] files = f.listFiles();       // 파일 정보의 배열
            System.out.println();
        } else {                     // 파일 -> 간략 정보만 출력
            System.out.println("File");
            // 간략한 파일 정보
            System.out.print(f.getName() + "\t");           //  파일명
            System.out.print(f.canRead() ? "r" : ".");      // 읽을 수 있는 파일인가?
            System.out.print(f.canWrite() ? "w" : ".");     // 기록할 수 있는 파일인가?
            System.out.print(f.canExecute() ? "x" : ".");   // 실행할 수 있는 파일인가?
            System.out.println();
        }
    }
}

