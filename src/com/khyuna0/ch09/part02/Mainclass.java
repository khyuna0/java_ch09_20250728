package com.khyuna0.ch09.part02;

public class Mainclass {

	// 객체 선언 불가한 인터페이스, 추상클래스 익명 객체 사용해 임시 객체 선언하기
	
	public static void operate(Calculator cal) { // 임시 객체가 인수값으로 들어옴
		System.out.println("연산결과 : " + cal.calculate(10, 20));
	}
	
	public static void main(String[] args) {
		
		// 1. 인터페이스를 구현한 익명 객체 예제
	
		// Greeting greeting = new Greeting(); -> 오류. 인터페이스는 객체 선언 불가.
		Greeting greeting = new Greeting() { // 익명 객체 생성 anonymous
			
			@Override
			public void Hi() {
				System.out.println("greeting");
				
			}
		}; 	greeting.Hi();
		System.out.println("==========");
		
		
		// 2. 추상 클래스를 상속한 익명 객체
			
		Animal animal = new Animal() {
			
			@Override
			void sound() {
				System.out.println("멍멍");
				
			}
			
			@Override
			void run() {
				System.out.println("깡총");
				
			}
		};
		animal.sound();
		animal.run();
		System.out.println("==========");
		
		// 3. 매서드의 매개변수로 익명 객체 전달
		
		// Calculator 로 만든 객체만 인수로 넣을 수 있음! -> 불가. Calculator = 인터페이스
		// 익명 객체를 사용하면 해결
		
		operate(new Calculator() {
			
			@Override
			public int calculate(int a, int b) {
				// TODO Auto-generated method stub
				return (a + b);
			}
		}); 
		
		
		}
	}