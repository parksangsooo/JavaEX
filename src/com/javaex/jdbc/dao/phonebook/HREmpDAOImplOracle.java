package com.javaex.jdbc.dao.phonebook;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HREmpDAOImplOracle implements HREmpDAO {

    @Override
    public List<HREmpVO> findEmployeesByName(String name) {
        List<HREmpVO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT first_name, last_name, email, phone_number, hire_date " +
                    "FROM HR.employees " +
                    "WHERE LOWER(first_name) LIKE ? OR LOWER(last_name) LIKE ?";

            conn = DBConnection.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%" + name.toLowerCase() + "%");
            pstmt.setString(2, "%" + name.toLowerCase() + "%");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                list.add(new HREmpVO(rs.getString(1),  // first_name
                        rs.getString(2),  // last_name
                        rs.getString(3),  // email
                        rs.getString(4),  // phone_number
                        rs.getDate(5)));  // hire_date
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    @Override
    public List<HREmpVO> findEmployeesBySalaryRange(int minSalary, int maxSalary) {
        List<HREmpVO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT first_name, last_name, salary " +
                    "FROM HR.employees " +
                    "WHERE salary BETWEEN ? AND ? " +
                    "ORDER BY salary ASC";

            conn = DBConnection.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, minSalary);
            pstmt.setInt(2, maxSalary);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                list.add(new HREmpVO(rs.getString(1),  // first_name
                        rs.getString(2),  // last_name
                        rs.getInt(3)));   // salary
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    @Override
    public List<HREmpVO> getList() {
        List<HREmpVO> list = new ArrayList<>();

        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "SELECT employee_id, first_name, last_name, email, phone_number, hire_date, salary FROM HR.employees";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                list.add(new HREmpVO(rs.getInt(1),  // employee_id
                        rs.getString(2),  // first_name
                        rs.getString(3),  // last_name
                        rs.getString(4),  // email
                        rs.getString(5),  // phone_number
                        rs.getDate(6),    // hire_date
                        rs.getInt(7)));   // salary
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
