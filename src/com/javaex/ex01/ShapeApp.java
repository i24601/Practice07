package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

//		Shape s = new Shape("빨강");
		//추상클래스는 객체생성 할수 없다
		//추상클래스를 상속받는 Rectangle Cirlcle을 통해 추상클래스 인스턴스인 필드값(fillColor)에 접근해야한다
		//c1.fillColor="빨강" 또는 r1.fillColor
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		//Ractangle Circle 생성자는 추상클래스이자 부모클래스인 Shape의 생성자에 접근한다(super)
		//Shape()생성자는 fillColor에 접근한다
		//추상클래스 인스턴스인 필드값(fillColor)을 자식클래스를 통해 접근
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		//sr1의 가로크기 출력
		System.out.printf("sr1의 가로는 %d 입니다",((Ractangle)sr1).getWidth());
		//Shape형인 sr1을 Ractangle형으로 형변환
		//sr1의 width는 private이므로 getWidth를 통해 접근
	}
}

	
	