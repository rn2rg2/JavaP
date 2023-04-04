package Test;

import java.util.Random;

public class Main{

	public static void main(String[] args) {
		Random rnd = new Random();
		int a = rnd.nextInt(10001);
		int b = rnd.nextInt(10001);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
}
