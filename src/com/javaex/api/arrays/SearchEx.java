package com.javaex.api.arrays;

import java.util.Arrays;

public class SearchEx {
    public static void main(String[] args) {
        // 1. 기본 타입 검색
        basicSearch();

        // 2. 사용자 정의 객체의 검색 (이 객체를 정렬할 수 있는 방법을 알아야 함.)
        // 정렬이 우선 -> 그 이후 검색
        customClassSearch();

    }
    private static void basicSearch(){
        // Java Arrays 의 search는 binarySearch 방식으로 구현.
        int[] nums = {6, 4, 3, 5, 7, 9, 8, 2, 1, 10};

        // 이진 검색 방식의 배열은 정렬이 되어 있어야 함.
        Arrays.sort(nums);
        System.out.println("정렬된 배열: " + Arrays.toString(nums));
        int index = Arrays.binarySearch(nums,       // 검색 대상 배열
                                        8);

        System.out.println("8의 인덱스: " + index);

        // 참조 타입의 검색
        String[] data = {"Java", "C", "C++", "Python", "Linux"};

        // 검색을 위한 정렬
        Arrays.sort(data);
        System.out.println("정렬된 배열: " + Arrays.toString(data));
        index = Arrays.binarySearch(data, "Java");
        System.out.println("Java의 인덱스: " + index);
        System.out.println("------------------------------");
    }

    private static void customClassSearch(){
        Member m1 = new Member("홍길동");
        Member m2 = new Member("고길동");
        Member m3 = new Member("임꺽정");
        Member m4 = new Member("장길산");
        Member[] members = {m1, m2, m3, m4};
        System.out.println("원본 배열: " + Arrays.toString(members));
        // binarySearch 를 위한 정렬
        Arrays.sort(members);
        System.out.println("정렬된 배열: " + Arrays.toString(members));

        int index = Arrays.binarySearch(members, m3);
        System.out.println(m3 + "의 인덱스: " + index);
    }
}
