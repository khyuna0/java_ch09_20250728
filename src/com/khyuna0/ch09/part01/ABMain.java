package com.khyuna0.ch09.part01;

public class ABMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A(); // a 인스턴스화
		
//		B b = new B(); -> 오류
		A.B b = a.new B(); // 중첩 클래스 B 객체 생성. B 객체는 A 객체가 만들어진 후에 생성가능
		
		b.f1 = 10;
		b.method1();
		
		
		A.C c = new A.C(); // 정적 멤버라 a.불필요 -> a.new x
		c.f1 = 100;
		
		A.C.f2 = 50;
		A.C.method2();
		
		
		
	}

}
