package com.javaex.ex01;

public class Ractangle extends Shape{
	
	private int width;
	private int height;
	
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
		
	public int getWidth() {
		return width;
	}

	public void showInfo(){
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}
	
	public void draw() {
		showInfo();
	}
	//추상클래스(Shape)에 draw가 선언되었으므로 추상클래스를 상속받는 클래스(Ractangle)에도 draw 생성
		

}


