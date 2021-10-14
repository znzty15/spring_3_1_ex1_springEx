package com.javaGG.ex;

public class Mycalculator {
	
	Calculator cal;
	private int num1;
	private int num2;
	
	public Mycalculator() {
		
	}

	public void addition() {
		cal.add(num1, num2);
	}
	
	public void subtraction() {
		cal.sub(num1, num2);
	}
	
	public void multiplication() {
		cal.multi(num1, num2);
	}
	
	public void division() {
		cal.div(num1, num2);
	}

	public void setcal(Calculator cal) {
		this.cal = cal;
	}

	public void setnum1(int num1) {
		this.num1 = num1;
	}

	public void setnum2(int num2) {
		this.num2 = num2;
	}
	
}
