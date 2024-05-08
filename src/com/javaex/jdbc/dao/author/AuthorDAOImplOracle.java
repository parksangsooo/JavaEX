package com.javaex.jdbc.dao.author;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAOImplOracle implements AuthorDAO {
    private Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(dburl,
                    DatabaseConfig.DB_USER, DatabaseConfig.DB_PASS);
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC 드라이버를 찾을 수 없어요.");
        }
        return conn;
    }

    @Override
    public List<AuthorVO> getList() {
        List<AuthorVO> list = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1. Connection
            conn = getConnection();
            // 2. Statement
            stmt = conn.createStatement();
            // 3. SQL 쿼리 전송 -> ResultSet
            String sql = "SELECT author_id, author_name, author_desc FROM author";
            rs = stmt.executeQuery(sql);
            // 4. ResultSet 순회 하면서 -> 레코드를 AuthorVO로 변경하면서 LIST에 추가
            while (rs.next()) {
//                list.add(new AuthorVO(rs.getLong("author_id"),rs.getString(2),rs.getString(3)));
                Long authorId = rs.getLong(1);
                String authorName = rs.getString(2);
                String authorDesc = rs.getString(3);

                AuthorVO vo = new AuthorVO(authorId, authorName, authorDesc);
                list.add(vo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
            }
        }
        // 5. 만들어진 리스트를 반환
        return list;
    }

    @Override
    public AuthorVO get(Long id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        AuthorVO vo = null;

        try {
            conn = getConnection();
            String sql = "SELECT author_id, author_name, author_desc FROM author "+
                    "WHERE author_id=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setLong(1, id);

            rs = pstmt.executeQuery();

            if(rs.next()) {
                Long authorId = rs.getLong(1);
                String authorName = rs.getString(2);
                String authorDesc = rs.getString(3);

                vo = new AuthorVO(authorId, authorName, authorDesc);
            }
        } catch(SQLException e) {
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

    @Override
    public boolean insert(AuthorVO authorVO) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int insertedCount = 0;      // INSERT 결과 영향받은 레코드 수
        try {
            // 커넥션
            conn = getConnection();
            // 실행계획 준비
            String sql = "INSERT INTO author (author_id, author_name, author_desc) " +
                    "VALUES (seq_author_id.NEXTVAL, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, authorVO.getAuthorName());
            pstmt.setString(2, authorVO.getAuthorDesc());

            // 쿼리 수행
            insertedCount = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
            }
        }
        return insertedCount == 1;      // insertedCount 가 1인가 아닌가
    }

    @Override
    public boolean delete(Long id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int deletedCount = 0;

        try {
            conn = getConnection();
            String sql = "delete from author where author_id =?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setLong(1, id);

            deletedCount = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            } catch (Exception e) {}
        }
        return deletedCount == 1;
    }

    @Override
    public boolean update(AuthorVO authorVO) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int updatedCount = 0;

        try {
            // 커낵션 맺기
            conn = getConnection();
            // 실행 계획 준비
            String sql = "UPDATE author SET author_name = ?, author_desc =? WHERE author_id =?";
            pstmt = conn.prepareStatement(sql);
            // 파라미터 바인딩
            pstmt.setString(1, authorVO.getAuthorName());
            pstmt.setString(2, authorVO.getAuthorDesc());
            pstmt.setLong(3, authorVO.getAuthorId());

            // SQL 실행 - 레코드 카운트 성공여부
            updatedCount = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
            }
            return updatedCount == 1;
        }
    }
}

