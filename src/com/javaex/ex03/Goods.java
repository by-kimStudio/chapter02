package com.javaex.ex03;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	//메소드 g/s
	
	
	/*
	 * public void setName(String n) { //힙에 호출되는 메모리 name = n; }
	 */
	public void setName(String name) {	//n-name으로 변경,앞에 this(명확한/헷갈리지 않으면 안써도 됨)
		this.name = name;				//설계할때만 쓰임.main에서는 안쓰임
	}
	public void setPrice(int price) {	//힙에 호출되는 메모리
		this.price = price;
	}
	public String getName() {
		return name ;
	}
	public int getPrice() {
		return price ;
	}
	//메소드- 일반
	

}
