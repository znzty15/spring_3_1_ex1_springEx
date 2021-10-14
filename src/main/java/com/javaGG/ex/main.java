package com.javaGG.ex;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mycalculator cal = new Mycalculator();
		cal.setcal(new Calculator());
		
		cal.setnum1(10);
		cal.setnum2(5);
		
		cal.addition();
		cal.subtraction();
		cal.multiplication();
		cal.division();		
		
	}

}
