package com.javaex.jdbc.dao.phonebook;

import java.util.Date;

public class HREmpVO {
    private Integer employeeId;
    private String fullName;
    private String email;
    private String phoneNum;
    private Date hire_date;
    private Integer salary;

    public HREmpVO() {
    }

    public HREmpVO(Integer employeeId, String fullName, String email, String phoneNum, Date hire_date, Integer salary) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.email = email;
        this.phoneNum = phoneNum;
        this.hire_date = hire_date;
        this.salary = salary;
    }

    public HREmpVO(Integer employeeId, String fullName, String email, String phoneNum, Date hire_date) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.email = email;
        this.phoneNum = phoneNum;
        this.hire_date = hire_date;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "HREmpVO{" +
                "employeeId=" + employeeId +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", hire_date=" + hire_date +
                ", salary=" + salary +
                '}';
    }
}
