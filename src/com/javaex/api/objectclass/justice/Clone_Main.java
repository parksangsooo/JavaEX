package com.javaex.api.objectclass.justice;

public class Clone_Main {

	public static void main(String[] args) {
		Clone_Person user = new Clone_Person();
		user.setName("박상수");
		
		try {
		Clone_Person copy = user; // (얕은복사)
		
		System.out.println(user.hashCode()); // 933699219
        System.out.println(copy.hashCode());  // 933699219
        System.out.println(user.equals(copy)); // true - 둘이 동일한 힙 데이터를 바라보고 있다.
        
        // 깊은 복사
        Clone_Person user2 = new Clone_Person();
        user2.setName("Edward");
        Clone_Person copy2 = (Clone_Person)user2.clone();
        
        System.out.println(user2.hashCode()); // 2121055098
        System.out.println(copy2.hashCode());  // 2084435065
        System.out.println(user2.equals(copy2)); // false - 둘은 복사되어 생김새만 같고 다른 힙데이터를 바라봄.
        
        // 간단한 단일 클래스 타입 정도는 위에 방식대로 그대로 복제가 가능하지만,
        // 클래스 타입을 여러개 담고 있는 배열을 복제할 때는 주의사항이 따른다.
        
        // 객체 배열은 그 자체로도 참조 타입이며, 가진 값도 참조 타입이다.
        // 만일 다루는 데이터의 형태가 객체와 같은 reference 타입일 경우 clone 메서드를 재정의 해야함.
        
        
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
