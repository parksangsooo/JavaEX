package com.javaex.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

class ClassRoom {
    // 필드
    private String subject;
    private String roomName;

    // 생성자
    public ClassRoom(String subject){
        // containsValue 에서 사용하기 위한 생성자
        this.subject = subject;
    }

    public ClassRoom(String subject, String roomName){
        super();
        this.subject = subject;
        this.roomName = roomName;
    }
    // toString
    @Override
    public String toString(){
        return "ClassRoom [subject = " + subject + ", roomName = " + roomName + "]";
    }

    // 동등성 체크 로직 ****
    // 1. subject 의 hashCode 를 전체 객체의 hashCode 로 삼는다.
    // 2. subject 의 값이 동일하면 전체 객체의 값도 같다고 판정 짓는다.
    // 두 개의 관문을 모두 통과해야 동등성을 확인

    @Override
    public int hashCode(){
        return subject.hashCode();
        // 여기 hashCode 는 인스턴스 메모리 주소임 -> subject 의 hashcode 로 바꿔줌.
    }

    @Override
    public boolean equals(Object obj){ // 캐스팅
        if (obj instanceof ClassRoom) {
            ClassRoom other = (ClassRoom) obj;
            return subject.equals(other.subject);
        }
        return super.equals(obj);
    }
}


public class HashTable {
    public static void main(String[] args) {
        // Map 형 자료형 (keyValue 쌍으로 관리) interface
        // KeySet 과 List 의 복합 자료형
        // Key(KeySet)은 순서가 없고, 중복 허용 안함
        // Value 는 key 를 통한 접근만 가능, 중복허용

        // Hashtable 선언
        Map<String, ClassRoom> map = new Hashtable<>();

        // map 에 데이터 넣기 (put) (KeySet 순서없이 출력됨, 중복허용 X)
        map.put("101", new ClassRoom("Java", "R101"));
        map.put("202", new ClassRoom("C", "R202"));
        map.put("303", new ClassRoom("Python", "R303"));
        map.put("404", new ClassRoom("Linux", "R404"));

        // 출력 //순서가 없음
        System.out.println(map);

        // 데이터 참조 : get (가져오기)
        System.out.println(map.get("303")); // 키를 통한 접근

        // 데이터 변경 : put
        map.put("202", new ClassRoom("C#", "R202"));
        // 202변경/새로 만들어진 객체에 넣기
        System.out.println(map.get("202"));

        // 특정 키를 포함하고 있는지 확인해보기( key)
        System.out.println(map.containsKey("202"));
        // key가 keyset에 포함되어 있는지 확인
        System.out.println(map.containsKey("505")); // 값과 관계없음 (key정보)

        // 특정 값을 포함하고 있는지 확인해보기(value)
        // 값에 Java가 포함된 값이 있는지 확인해보기
        System.out.println(map.containsValue("Java")); // false //두객체 동등성비교필요
        System.out.println(map.containsValue(new ClassRoom("Java")));

        // Iterator 순회
        System.out.println("=============Iterator");
        Iterator<String> it = map.keySet().iterator();
        // 키셋으로부터 이터레이터 추출 (임포트)

        while (it.hasNext()) { // 뒤에 요소가 더 있는지 확인
            ClassRoom room = map.get(it.next());
            System.out.println(room);
        }

        // 맵 비우기
        map.clear();
        System.out.println(map);
    }
}
