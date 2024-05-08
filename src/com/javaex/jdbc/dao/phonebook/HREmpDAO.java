package com.javaex.jdbc.dao.phonebook;

import java.util.List;

public interface HREmpDAO {
public List<HREmpVO> getList();
public HREmpVO get(String string);
//public boolean insert(HREmpVO hrEmpVO);
//public boolean delete(Integer id);
//public boolean update(HREmpVO hrEmpVO);

}
