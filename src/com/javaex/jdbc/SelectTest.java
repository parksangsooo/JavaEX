package com.javaex.jdbc;

import java.sql.*; // java.sql 패키지의 모든 클래스와 인터페이스를 임포트

public class SelectTest {
    public static void main(String[] args) {
        // 데이터베이스 접속 정보
        String dburl = "jdbc:oracle:thin:@localhost:1521:xe"; // DB URL
        String dbuser = "hr"; // DB 사용자명
        String dbpass = "hr"; // DB 패스워드

        // JDBC 객체 선언
        Connection conn = null; // 데이터베이스 연결을 관리하는 Connection 객체
        Statement stmt = null;  // SQL 문을 실행하는 Statement 객체
        ResultSet rs = null;    // SQL 쿼리의 결과를 저장하는 ResultSet 객체

        try {
            // Oracle JDBC Driver 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // 데이터베이스 연결
            conn = DriverManager.getConnection(dburl, dbuser, dbpass);
            // Statement 객체 생성
            stmt = conn.createStatement();
            rs = null; // ResultSet 초기화
            String sql = "SELECT department_id, department_name FROM departments"; // 실행할 SQL 문
            rs = stmt.executeQuery(sql);    // SQL 쿼리 실행 및 결과 반환 (DB Cursor 반환)

            // ResultSet을 순회하며 데이터 추출
            while (rs.next()) {
                // 각 컬럼 값을 추출 (getXXX[컬럼순서] or getXXX[컬럼 프로젝션 이름])
                int deptId = rs.getInt(1);   // 첫 번째 컬럼(컬럼 순서)의 정수 값(부서 ID)을 가져옴 (rs.getInt("department_id") 도 가능)
                String deptName = rs.getString("department_name"); // "department_name" 컬럼의 문자열 값(부서 이름)을 가져옴 (rs.getString(2) 도 가능)
                // 결과 출력
                System.out.printf("%d:%s%n", deptId, deptName);
            }
        } catch (ClassNotFoundException e) {
            // JDBC 드라이버 로드 실패 시 예외 처리
            System.err.println("JDBC 드라이버를 로드하지 못했습니다.");
            e.printStackTrace();
        } catch (SQLException e) {
            // SQL 실행 실패 시 예외 처리
            System.err.println("SQLError!");
            e.printStackTrace();
        } finally {
            // 시스템 자원 정리
            try {
                rs.close(); // ResultSet 닫기
            } catch (Exception e) {
                // ResultSet 닫기 실패
            }
            try {
                stmt.close(); // Statement 닫기
            } catch (Exception e) {
                // Statement 닫기 실패
            }
            try {
                conn.close(); // Connection 닫기
            } catch (Exception e) {
                // Connection 닫기 실패
            }
        }
    }
}
