package com.javaex.jdbc.dao.author;

import java.util.List;

public interface AuthorDAO {
    // LIST - SELECT 쿼리
    public List<AuthorVO> getList();                // 전체 목록

    public AuthorVO get(Long id);                   // PK로 객체 찾기

    public boolean insert(AuthorVO authorVO);       // 레코드 삽입

    public boolean delete(Long id);                 // 레코드 삭제

    public boolean update(AuthorVO authorVO);       // 레코드 갱ㅇ신
}
