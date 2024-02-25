package Chapter03;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");

		int number = input.nextInt();

		if (number % 5 == 0) {
			System.out.println("HiFive");
		} else if (number % 2 == 0) {
			System.out.println("HiEven");
		} else {
			System.out.println("not comment");
		}

	}

}
