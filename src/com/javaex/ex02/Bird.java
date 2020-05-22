package com.javaex.ex02;

public abstract class Bird {
    private String name;
    
    public abstract void sing();

    public abstract void fly();
    
    public abstract void showName();
    
    protected String getName() {
    	return name;
    }
    
    public void setName(String name) {
		this.name=name;
	}
    //추상클래스는 완전한 메소드 추상 메소드 둘다 쓸수있다
    //참고 인터페이스는 추상 메소드만 쓸수있음

}
