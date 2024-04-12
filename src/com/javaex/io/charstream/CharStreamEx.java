package com.javaex.io.charstream;

import java.io.*;

public class CharStreamEx {
    private static String rootPath = System.getProperty("user.dir") + "\\files\\";
    private static String fileName = rootPath + "char.txt";

    public static void main(String[] args) {

        // FileWriter :
        // writeFile();

        // FileReader :
        readFile();
    }

    private static void writeFile() {
        // FileWriter 를 이용해서 txt 파일 생성.
        System.out.println("파일명: " + fileName);

        try (
                // Stream 을 열고
                FileWriter writer = new FileWriter(fileName);
        ) {       // txt 기록
            writer.write("하이미디어 아카데미\r\n");
            writer.write("Java Programming\r\n");
            writer.write("2024. 04");
            writer.flush();
            // writer.close();

        } catch (FileNotFoundException e) {
            System.err.println("파일이 존재하지 않아요.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("생성 완료.");

    }

    private static void readFile(){
        // 읽을 파일 확인
        System.out.println("파일명: " + fileName);

        // stream 열기
        try (
                Reader reader = new FileReader(fileName);
                ){
            // 읽어들일 데이터 저장 변수
            int data = 0;
            String message = "";

            // 2바이트 (char) 읽어서 -> int 로 변환
            while ((data = reader.read()) != -1){   // -1이면 더 읽을 수 없음.(읽을 수 없을 때 까지)
                System.out.println("읽은 데이터: " + (char)data);
                message += (char)data;
            }
            System.out.println(message);
        }catch (FileNotFoundException e){
            System.err.println("파일을 찾을 수 없어요.");
        }catch (IOException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("읽기 완료");
    }
}
