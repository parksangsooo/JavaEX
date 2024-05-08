package com.javaex.jdbc.dao.phonebook;

import com.javaex.jdbc.dao.author.AuthorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HREmpDAOImplOracle implements HREmpDAO {

    private Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(dburl, DatabaseConfig.DB_USER, DatabaseConfig.DB_PASS);
        }catch (ClassNotFoundException e) {
            System.err.println("JDBC 드라이버를 찾을 수 없어요.");
        }
        return conn;
    }


    @Override
    public List<HREmpVO> getList() {
        List<HREmpVO> list = new ArrayList<>();

        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            String sql = "SELECT employee_id, first_name || ' ' || last_name as fullname, email, phone_number, hire_date, salary FROM new_employees";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                list.add(new HREmpVO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getInt(6)));
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public HREmpVO get(String string) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        HREmpVO vo = null;

        try {
            conn = getConnection();
            String sql = "SELECT employee_id, first_name, last_name, email, phone_number, hire_date " +
                    "FROM new_employees " +
                    "WHERE lower(first_name) LIKE ? OR lower(last_name) LIKE ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, string);
            pstmt.setString(2, string);


            rs = pstmt.executeQuery();

            if (rs.next()){
                Integer empId = rs.getInt(1);
                String fName = rs.getString(2);
                String lName = rs.getString(3);
                String email = rs.getString(4);
                String phoneNum = rs.getString(5);
                Date hireDate = rs.getDate(6);

                vo = new HREmpVO(empId,fName+" "+lName,email,phoneNum,hireDate);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try{
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {}
        }
        return vo;
    }

}
