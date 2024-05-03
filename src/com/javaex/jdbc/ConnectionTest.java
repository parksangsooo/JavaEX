package com.javaex.jdbc;  // 패키지 선언: 이 클래스가 com.javaex.jdbc 패키지에 속함을 명시합니다.

import java.sql.DriverManager; // java.sql 패키지에서 DriverManager 클래스를 임포트합니다.
import java.sql.SQLException;  // SQLException 클래스를 임포트하여 SQL 관련 예외 처리를 가능하게 합니다.
import java.sql.Connection;    // Connection 인터페이스를 임포트하여 데이터베이스 연결을 관리합니다.

// 데이터베이스 접속을 테스트하는 클래스
public class ConnectionTest {

    // 프로그램의 시작점인 main 메서드 정의
    public static void main(String[] args) {
        // 데이터베이스 접속 정보 정의
        String dburl = "jdbc:oracle:thin:@localhost:1521:xe";  // 데이터베이스의 URL
        String dbuser = "hr";  // 데이터베이스 사용자 이름
        String dbpass = "hr";  // 데이터베이스 사용자 비밀번호

        Connection conn = null;  // Connection 객체를 null로 초기화

        try {
            // Oracle JDBC 드라이버를 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // DriverManager를 사용하여 데이터베이스에 접속 시도
            conn = DriverManager.getConnection(dburl, dbuser, dbpass);

            // 접속 성공 메시지 출력
            System.out.println(conn);  // 연결 객체 정보 출력
            System.out.println("연결 성공!");  // 연결 성공 메시지 출력
        } catch (ClassNotFoundException e) {  // JDBC 드라이버 로드 실패 시 처리
            System.err.println("JDBC 드라이버를 로드하지 못했습니다.");
            e.printStackTrace();  // 오류 스택 추적 출력
        } catch (SQLException e) {  // SQL 실행 오류 시 처리
            System.err.println("SQLError!");
            e.printStackTrace();  // 오류 스택 추적 출력
        } finally {
            try {
                conn.close();  // 자원 해제를 위해 Connection 객체를 닫습니다.
            } catch (Exception e) {  // 닫기 동작 중 오류 발생 시 처리
                // 오류 처리 코드 없음
            }
        }
    }
}
