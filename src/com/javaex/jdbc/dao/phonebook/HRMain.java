package com.javaex.jdbc.dao.phonebook;

import java.util.List;
import java.util.Scanner;

public class HRMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HREmpDAO dao = new HREmpDAOImplOracle();

        listEmployees();
        System.out.println();

        while (true) {
            System.out.println("======================================================");
            System.out.print("서비스를 선택하세요 1. 정보검색  2. 급여검색  3. 종료 : \n");
            System.out.println("======================================================");
            int choice = sc.nextInt();
            sc.nextLine(); // 개행 문자 소비

            switch (choice) {
                case 1:
                    System.out.print("사원 이름을 입력하세요: ");
                    String name = sc.nextLine();
                    List<HREmpVO> vosEmployees = dao.findEmployeesByName(name);

                    if (vosEmployees.isEmpty()) {
                        System.out.println("사원 정보가 없습니다.");
                    } else {
                        for (HREmpVO vo : vosEmployees) {
                            System.out.printf("%-18s\t%-10s\t%s\t%s\n",
                                    vo.getFullName(), vo.getEmail(), vo.getPhoneNum(), vo.getHireDate());
                        }
                        System.out.println("total: "+ vosEmployees.size() + " rows");
                    }
                    break;

                case 2:
                    System.out.print("최소 급여를 입력하세요: ");
                    int minSalary = sc.nextInt();
                    System.out.print("최대 급여를 입력하세요: ");
                    int maxSalary = sc.nextInt();

                    List<HREmpVO> vosSalary = dao.findEmployeesBySalaryRange(minSalary, maxSalary);

                    if (vosSalary.isEmpty()) {
                        System.out.println("검색된 사원 정보가 없습니다.");
                    } else {
                        for (HREmpVO employee : vosSalary) {
                            System.out.printf("%-18s\t%d\n",
                                    employee.getFullName(), employee.getSalary());
                        }
                        System.out.println("total: " + vosSalary.size() + " rows");
                    }
                    break;

                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                default:
                    System.out.println("잘못된 선택입니다.");
                    break;
            }
        }
    }

    private static void listEmployees() {
        HREmpDAO dao = new HREmpDAOImplOracle();
        System.out.println("======================== Employees Info ===========================");

        List<HREmpVO> list = dao.getList();
        if (!list.isEmpty()) {
            for (HREmpVO vo : list) {
                System.out.printf("%d\t%-18s\t%-10s\t%s\t%s\n", vo.getEmployeeId(), vo.getFullName(), vo.getEmail(), vo.getPhoneNum(), vo.getHireDate());
            }
            System.out.println("total: "+ list.size() +" rows");
        } else {
            System.out.println("데이터가 없어요.");
        }
    }
}
