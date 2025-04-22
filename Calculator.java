package week1.day1;

public class Calculator {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(125, 24);
		c.sub(125, 24);
		c.mul(125, 24);
		c.div(125, 24);
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	public void mul(int a, int b) {
		System.out.println(a * b);
	}

	public void div(float a, float b) {
		System.out.println(a / b);
	}
}
