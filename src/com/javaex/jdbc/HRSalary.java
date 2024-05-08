package com.javaex.jdbc;

import java.sql.*;
import java.util.Scanner;

public class HRSalary {
    public static void main(String[] args) {
        // 데이터베이스 접속 정보
        String dburl = "jdbc:oracle:thin:@localhost:1521:xe"; // DB URL
        String dbuser = "hr"; // DB 사용자명
        String dbpass = "hr"; // DB 패스워드

        Scanner sc = new Scanner(System.in);
        System.out.println("최소 급여와 최대 급여를 입력하세요. (예: 2000 10000)");
        int minSalary = sc.nextInt();
        int maxSalary = sc.nextInt();
        System.out.println("====================================");

        String sql = "SELECT first_name || ' ' || last_name, salary FROM employees "
                + "WHERE salary BETWEEN "
                + minSalary + " AND " + maxSalary + " ORDER BY salary ASC";
        System.out.println("Query:" + sql);


        // 데이터 베이스 연결
        try {
            // 데이터 베이스 드라이버 클래스 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(dburl, dbuser, dbpass);

            // 쿼리 실행
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);  // 쿼리 실행

            // 결과 출력
            int count = 0;
            while (rs.next()) {
                String name = rs.getString("name");
                int salary = rs.getInt("salary");
                System.out.printf("%-20s \t %d\n", name, salary);
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
