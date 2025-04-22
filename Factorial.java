package week1.day1;

public class Factorial {
// 5! 5*4*3*2*1 = 120
	public static void main(String[] args) {
		// initialize the variable
		int num = 5;
		int tmp = 1;

		for (int i = num; i >= 1; i--) {
			tmp = tmp * i;
		}
		System.out.println("Factorial Value :" + tmp);
	}

}
