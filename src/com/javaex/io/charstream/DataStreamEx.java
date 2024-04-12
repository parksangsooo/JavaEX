package com.javaex.io.charstream;

import java.io.*;

public class DataStreamEx {
    private static String rootPath = System.getProperty("user.dir") + "\\files\\";
    public static String fileName = rootPath + "primitives.bin";

    // 기본 데이터 타입을 byte 로 저장하는 보조 스트림.
    public static void main(String[] args) {
        // DataOutputStream 을 이용한 기본 데이터 저장
        writePrimitives();

        // DataInputStream 을 이용한 기본 데이터 읽어오기
        readPrimitives();

    }
    private static void writePrimitives(){
        // 스트림 열기
        try (
                // 기본 스트림 열기
                FileOutputStream fos = new FileOutputStream(fileName);
                // 보조스트림
                DataOutputStream dos = new DataOutputStream(fos);

               // DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));
                // BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file), bufferSize);

        )
        {   // 1 Set
            dos.writeUTF("홍길동");            // String 저장(이름)
            dos.writeBoolean(true);             // boolean 저장(결혼)
            dos.writeInt(25);                   // int 저장(나이)
            dos.writeFloat(80.9f);              //  float 저장 (키)

            // 2 Set
            dos.writeUTF("고길동");            // String 저장
            dos.writeBoolean(false);             // boolean 저장
            dos.writeInt(50);                   // int 저장
            dos.writeFloat(99.9f);              //  float 저장
        } catch (FileNotFoundException e){
            System.err.println("파일을 찾을 수 없어요.");
        }catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("쓰기 완료.");
    }

    private static void readPrimitives(){
        System.out.println("저장파일: " + fileName);

        try (
                // 주 스트림
                InputStream fis = new FileInputStream(fileName);
                // 보조 스트림
                DataInputStream dis = new DataInputStream(fis);
                )
        {
                 // 출력된 순서와 같은 순서
            for (int i = 0; i < 2; i++) {
                String s = dis.readUTF();       // String
                boolean b = dis.readBoolean();  // boolean
                int i2 = dis.readInt();        // int
                float f = dis.readFloat();      // float

                System.out.println(s);
                System.out.println(b);
                System.out.println(i2);
                System.out.println(f);

            }
        }catch (FileNotFoundException e) {
            System.err.println("파일을 찾을 수 없어요.");
        }catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("읽기 완료.");
    }
}
