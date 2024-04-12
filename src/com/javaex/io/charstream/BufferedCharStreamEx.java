package com.javaex.io.charstream;

import java.io.*;

public class BufferedCharStreamEx {
    private static String rootPath = System.getProperty("user.dir") + "\\files\\";
    private static String source = rootPath + "last-leaf.txt";
    private static String target = rootPath + "last-leaf-filtered.txt";


    // source 파일에서 "leaf" & " leave" 이 포함된 문장만 필터링해서 target 에 저장
    public static void main(String[] args) {
        // 파일 정보 출력
        System.out.println("원본 파일명: " + source);
        System.out.println("타겟 파일명: " + target);

        // 스트림 연결
        try (
                // 주스트림 연결
                Reader fr = new FileReader(source);
                Writer fw = new FileWriter(target);

                // 보조스트림 연결
                // 라인 단위 문자열 작업 -> Buffer 기능 사용
                BufferedReader br = new BufferedReader(fr);
                BufferedWriter bw = new BufferedWriter(fw);
                )
        {
            String line = "";
            while((line = br.readLine()) != null){          // 읽어들일 라인이 없으면 null(널값이 나올때 까지)
                // System.out.println(line);

                // leaf or leaves 가 들어있는 라인만 필터링
                if (line.toLowerCase().contains("leaf") || line.toLowerCase().contains("leaves")) {
                    // System.out.println(line);
                    // 필터링 된 라인만 별도로 저장
                    bw.write(line);
                    bw.newLine();
                }
            }
//            for (int i = 1; (line = br.readLine()) != null; i++) {
//                if(line.indexOf("leaf") != -1 || line.indexOf("leave") != -1){
//                    System.out.println(i + ", " + line);
//                    bw.write(i);
//                }
//                br.close();
//            }
            System.out.println("필터링 완료.");
        }catch (FileNotFoundException e){
            System.err.println("파일을 찾을 수 없어요.");
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("생성 완료.");
    }
}
