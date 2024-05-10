package com.javaex.jdbc.dao.phonebook;

import java.util.List;

public interface HREmpDAO {
    List<HREmpVO> findEmployeesByName(String name);
    List<HREmpVO> findEmployeesBySalaryRange(int minSalary, int maxSalary);
    List<HREmpVO> getList();
}
