package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal dog1 = new Dog("Snoopy"); 	
		// UpCasting 방식 (부모타입으로 자손객체 참조)
		//		자동 캐스팅
		// 참조 타입에 설계된 것만 사용할 수 있다.
		
		dog1.eat();
		dog1.walk();
//		dog1.Bark(); 	// 설계도에 있는 것만 사용 가능하기에, Animal에 없는 Brak은 불러올 수 없음.
		
		Dog dog2 = new Dog("Doogy");
		dog2.eat();
		dog2.walk();
		dog2.Bark();
		
		// DownCasting 방식(명시적으로 타입을 지정해 줘야함)
		// dog1을 Bark() 하게 해보자
		
		((Dog)(dog1)).Bark(); 	// Animal -> Dog 로 Casting 됨.
		
		{
			Dog pet = new Dog("Azi");
			pet.eat();
			pet.walk();
			pet.Bark();
			
			pet = null;
			
//			pet = new Cat("아즈라엘");	// 부모가 아닌 클래스에서는 참조 불가
		}
		
		{
			Animal pet = new Dog("Azi");
			pet.eat();
			pet.walk();
//			pet.Bark();
			
			// 현재 pet의 어떤 클래스의 인스턴스인지 확인
			if (pet instanceof Dog) {	// Dog의 인스턴스면
				((Dog)pet).Bark();
			} else if (pet instanceof Cat) {	// Cat 인스턴스면
				((Cat)pet).Meow();
				
			}
			
			pet = null;
			
			pet = new Cat("kitty");
			pet.eat();
			pet.walk();
//			pet.Meow();
			
			if (pet instanceof Dog) {	// Dog의 인스턴스면
				((Dog)pet).Bark();
			} else if (pet instanceof Cat) {
				((Cat)pet).Meow();
				
			}
			
			
		}

	}

}
