package week2.day1;

public class StringReverse {
	public static void main(String[] args) {
		String str = "Inthira";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}