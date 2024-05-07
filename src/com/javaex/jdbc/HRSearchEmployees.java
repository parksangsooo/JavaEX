package com.javaex.jdbc;

import java.sql.*;
import java.util.Scanner;

public class HRSearchEmployees {
    public static void main(String[] args) {
        // 데이터베이스 접속 정보
        String dburl = "jdbc:oracle:thin:@localhost:1521:xe"; // DB URL
        String dbuser = "hr"; // DB 사용자명
        String dbpass = "hr"; // DB 패스워드

        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 사원의 이름 또는 성을 입력하세요: ");
        String inputName = sc.nextLine();


        String sql = "SELECT first_name, last_name, email, phone_number, hire_date " +
                "FROM employees " +
                "WHERE lower(first_name) LIKE '%" + inputName.toLowerCase() + "%' OR " +
                "lower(last_name) LIKE '%" + inputName.toLowerCase() + "%'";


        // 데이터 베이스 연결
        try {
            // 데이터 베이스 드라이버 클래스 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(dburl, dbuser, dbpass);

            // 쿼리 실행
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // 결과 출력
            int count = 0;
            while (rs.next()) {
                String fName = rs.getString("first_name");
                String lName = rs.getString("last_name");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phone_number");
                Date hireDate = rs.getDate("hire_date");
                System.out.printf("[Name]: %s %s, [email]: %s, [phone]: %s, [HireDate]: %s\n", fName,lName,email,phoneNumber,hireDate);
                count++;
            }
            System.out.println("count = " + count);

            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC 드러이버를 로드하지 못했습니다.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("SQLError!");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
