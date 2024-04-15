package com.javaex.io.charstream;

import java.io.*;
import java.util.StringTokenizer;

public class StringTokenizerEx {
    private static String rootPath = System.getProperty("user.dir") + "\\files\\";
    private static String fileName = rootPath + "thieves.txt";
    public static void main(String[] args) {
        System.out.println("원본: " + fileName);

        try (
                Reader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr);
                )
        {
            String line;        // 한 줄을 읽어오기 위한 변수
            while ((line = br.readLine()) != null) {
                // 토크나이징 작업
                StringTokenizer str = new StringTokenizer(line," ");        //   라인을 공백문자로 토크나이징 한다.
                while (str.hasMoreTokens()) {       // 뒤에 토큰이 더 있는가?
                    String token = str.nextToken();
                    System.out.println("Token: " + token);
                }
                br.close();
            }

        }catch (FileNotFoundException e){
            System.err.println("파일을 찾을 수가 없어요.");
        }catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
