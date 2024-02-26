package Chapter03;

import java.util.Scanner;

public class SwitchCaseStatements {

	public static void main(String[] args) {
//		switch (8) {
//		case 0:
//			System.out.println("compute tax for single filers");
//			break;
//		case 1:
//			System.out.println("compute tax for married jointly or qualifying widow(er)");
//			break;
//		case 2:
//			System.out.println("compute tax for married filing separately");
//			break;
//		case 3:
//			System.out.println("compute tax for head of household");
//			break;
//		default:
//			System.out.println("Error: invalid status");
//			System.exit(1);
//		}
//
//		int x = 3;
//		int y = 3;
//		switch (x + y) {
//		case 6:
//			y = 1;
//			break;
//		default:
//			y += 1;
//		}
//
//		System.out.println(y);

		System.out.println("Enter the number of the day of the week");
		Scanner input = new Scanner(System.in);

		int key = input.nextInt();

		switch (key) {
		case 1: {
			System.out.println("Today is monday!");
			break;
		}
		case 2: {
			System.out.println("Today is tuesday!");
			break;
		}
		case 3: {
			System.out.println("Today is wednesday!");
			break;
		}
		case 4: {
			System.out.println("Today is thursday!");
			break;
		}
		case 5: {
			System.out.println("Today is friday!");
			break;
		}
		case 6: {
			System.out.println("Today is saturday!");
			break;
		}
		case 7: {
			System.out.println("Today is sunday!");
			break;
		}
		default:
			System.out.println("wrong value");
			break;
		}

	}

}
