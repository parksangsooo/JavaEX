package com.javaex.collection.hash;


import java.util.Arrays;
import java.util.HashSet;

class Student {
    int id;         // 학생 ID
    String name;    // 이름

    // 생성자
    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    // Getter Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    // 객체의 동등성 비교를 위한 두 개의 관문
    // 1. hashCode()
    // 2. equals()

    public int hashCode() {
        // hashCode 함수의 로직 : 학번을 기준으로 잡는다로 가정할 때,
        return id;
    }

    // 값의 동일성 판별을 위한 equals 메서드 오버라이드
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student other = (Student)obj;
            return this.id == other.id &&
                    this.name.equals(other.name);
        }
        return super.equals(obj);
    }
}

public class HashSetEx {
    public static void main(String[] args) {
        // 1. HashSet 사용법(기본타입)
        //usingHashSet();

        // 2. 집합 연산
        //setOperation();

        // 3. HashSet 사용법(객체 자료형)
        usingHashSetWithCustom();

    }
    private static void usingHashSet(){
        // HashSet 선언
        HashSet<String> hashSet = new HashSet<>();

        // 요소(객체) 추가
        hashSet.add("Java");
        hashSet.add("C");
        hashSet.add("C++");
        hashSet.add("Python");
        hashSet.add("Java");

        System.out.println("hs: " + hashSet);
        System.out.println("size: " + hashSet.size());

        // 특정 개체 포함 여부
        System.out.println("C++ 포함? " + hashSet.contains("C++"));
        System.out.println("Linux 포함? " + hashSet.contains("Linux"));

        // HashSet 은 순서가 없기 때문에 오로지 객체로의 삭제하는 방법만 제공됨.
        hashSet.remove("C++");
        System.out.println("hs: " + hashSet);
    }

    private static void setOperation(){
        // 집합 연산
        HashSet<Integer> numbers =
                new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("전체 집합: " + numbers);

        HashSet<Integer> odds =
                new HashSet<>(Arrays.asList(1, 3, 5, 7, 9)); // 홀수 집합
        System.out.println("홀수 집합: " + odds);

        HashSet<Integer> evens =
                new HashSet<>(Arrays.asList(2, 4, 6, 8, 10));  // 짝수 집합
        System.out.println("짝수 집합: " + evens);

        HashSet<Integer> mThree =
                new HashSet<>(Arrays.asList(3, 6, 9));  // 3의 배수 집합
        System.out.println("3의 배수집합: " + mThree);

        // 교집합 : retainALl
        // 원본 보호를 위해 복제해서 사용
        System.out.println("----------------- 교집합");
        HashSet<Integer> setA = (HashSet<Integer>)odds.clone();
        HashSet<Integer> setB = (HashSet<Integer>)mThree.clone();
        System.out.println("집합A: " + setA);
        System.out.println("집합B: " + setB);

        setA.retainAll(setB);   // 집합 A와 B의 교집합 = {3, 9}
        System.out.println("교집합: " + setA);
        System.out.println(setA.equals(new HashSet<Integer>(Arrays.asList(3, 9))));

        // 합집합: addAll
        System.out.println(" -------------------- 합집합");
        setA = (HashSet<Integer>)odds.clone();
        setB = (HashSet<Integer>)evens.clone();

        System.out.println("집합A: " + setA);
        System.out.println("집합B: " + setB);

        setA.addAll(setB);      // 집합 A와 B의 합집합
        System.out.println("합집합: " + setA);
        System.out.println(setA.equals(numbers));

        // 차집합: removeAll
        System.out.println(" -------------------- 차집합");
        setA = (HashSet<Integer>)numbers.clone();
        setB = (HashSet<Integer>)odds.clone();
        System.out.println("집합A: " + setA);
        System.out.println("집합B: " + setB);

        setA.removeAll(setB);       // 집합 A - 집합 B

        System.out.println("차집합: " + setA);
        System.out.println(setA.equals(evens));
    }

    private static void usingHashSetWithCustom (){
        HashSet<Student> hs = new HashSet<>();

        Student s1 = new Student(10, "홍길동");
        Student s2 = new Student(20, "홍길동");
        Student s3 = new Student(30, "고길동");
        Student s4 = new Student(30, "고길동");

        hs.add(s1); hs.add(s2); hs.add(s3); hs.add(s4);
        System.out.println("학생부: " + hs);



    }
}
