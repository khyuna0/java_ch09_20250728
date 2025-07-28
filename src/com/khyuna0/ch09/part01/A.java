package com.khyuna0.ch09.part01;

public class A {

	public A() {
		System.out.println("A 객체 생성");
	}
	
	// 인스턴스 멤버 클래스 B -> 인스턴스로 만들어진 후에. 
	public class B { 
		// 필드
		int f1;
		// 생성자
		public B() {
			System.out.println("B 객체 생성");
		}
		// 메소드
		 public void method1() {
			 
		 }
		
	}
	
	// 정적 멤버 클래스 C -> 그냥 클래스 이름 통해 사용가능
	
	public static class C {
		public C() {
			System.out.println("C 객체 생성");
		}
		int f1;
		static int f2;
		public static void method2() {
			 
		 }
	}

}
