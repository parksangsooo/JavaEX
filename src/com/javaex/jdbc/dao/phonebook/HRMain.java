package com.javaex.jdbc.dao.phonebook;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class HRMain {
    public static void main(String[] args) {
        listEmployees();
        System.out.println();
        getEmployees();
        System.out.println();
    }

    private static void getEmployees() {
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 사원의 이름 또는 성을 입력하세요: ");
        String inputName = sc.nextLine();
        inputName = "%" + inputName.toLowerCase() + "%";

        HREmpDAO dao = new HREmpDAOImplOracle();
        HREmpVO vo = dao.get(inputName);

        if (vo != null) {
            System.out.printf("%d\t %-15s \t %-10s \t %s \t %s\n",vo.getEmployeeId(),vo.getFullName(),vo.getEmail(), vo.getPhoneNum(), vo.getHire_date());
        } else {
            System.out.println("레코드를 찾지 못했어요.");
        }
        sc.close();

    }

    private static void listEmployees() {
        HREmpDAO dao = new HREmpDAOImplOracle();
        System.out.println("======================== Employees Info ===========================");

        List<HREmpVO> list = dao.getList();
        if (list.size() > 0) {
            Iterator <HREmpVO> it = list.iterator();
            while (it.hasNext()) {
                HREmpVO vo = it.next();
                System.out.printf("%d\t %-15s \t %-10s \t %s \t %s\n",vo.getEmployeeId(),vo.getFullName(),vo.getEmail(), vo.getPhoneNum(), vo.getHire_date());
            }
        }else {
            System.out.println("데이터가 없어요.");
        }
    }
}
