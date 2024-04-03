package com.javaex.api.util.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
// java.sql.Date 와 혼동하지 말자

public class DataEx {
    public static void main(String[] args) {
        // 날짜와 시간 데이터를 표현하는 객체
        // 날짜 관련 기능은 Calendar 객체
        Date now = new Date();      // 현재 날짜와 시간 Get!
        System.out.println("현재 시간: " + now);

        // Date 기본 출력
        // DateFormat 클래스로 기본적인 출력 형식을 맞출 수 있음.
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);    // Full
        System.out.println("FULL FORMAT: " + df.format(now));
        df = DateFormat.getDateInstance(DateFormat.LONG);               // LONG 형식
        System.out.println("LONG: " + df.format(now));
        df = DateFormat.getDateInstance(DateFormat.MEDIUM);             // MEDIUM 형식
        System.out.println("MEDIUM: "+ df.format(now));
        df = DateFormat.getDateInstance(DateFormat.SHORT);              // SHORT 형식
        System.out.println("SHORT: "+ df.format(now));

        // Date Format 과 Time Format 을 이용 날짜와 시간 표기
        // SimpleDateFormat
        // ex) 2024년 04월 03일 12시 37분 00초
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        System.out.println("날짜 포맷: " + sdf.format(now));

    }
}
