package com.javaGG.ex;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mycalculator cal = new Mycalculator();//Mycalculator 변수 선언
		cal.setcal(new Calculator());//Mycalculator 변수에 Calculator 데이터를 넣어줌
		
		cal.setnum1(10);
		cal.setnum2(5);
		
		cal.addition(); //Mycalculator를 의존해서 데이터를 Calculator에서 가져옴
		cal.subtraction();
		cal.multiplication();
		cal.division();	
	}

}
