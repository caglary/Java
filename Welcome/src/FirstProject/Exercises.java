package FirstProject;

import java.util.Scanner;

public class Exercises {

	public static void exam01() {
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Computer Science");
		System.out.println("Programing is Fun");
		System.out.println("E M İ N - ÇAĞLAR");
	}

	public static void exam02() {
		/*
		 * (Area and perimeter of a circle) Write a program that displays the area and
		 * perimeter of a circle that has a radius of 5.5 using the following formula:
		 * 
		 * perimeter = 2 * radius * p area = radius * radius * p
		 */

		double perimeter;
		double area;
		double radius;
		final double PI = 3.14;
		System.out.print("Enter the radius : ");
		Scanner myObj = new Scanner(System.in);
		radius = myObj.nextDouble();

		perimeter = 2 * radius * PI;
		area = radius * radius * PI;

		System.out.println("The area of circle with radius " + radius + " is " + area);
		System.out.println("The perimeter of circle with radius " + radius + " is " + perimeter);

	}

	public static void exam03() {

		/*
		 * (Area and perimeter of a rectangle) Write a program that displays the area
		 * and perimeter of a rectangle with the width of 4.5 and height of 7.9 using
		 * the following formula: area = width * height
		 */
		Scanner myObj = new Scanner(System.in);

		double area;
		double perimeter;

		System.out.print("witdh of rectangle : ");
		double width = myObj.nextDouble();

		System.out.print("height of rectangle : ");
		double height = myObj.nextDouble();
		area = width * height;
		perimeter = 2 * (width + height);

		System.out.println("Area of rectangle with height " + height + " and width " + width + " is " + area);
		System.out.println("Perimeter of rectangle with height " + height + " and width " + width + " is " + perimeter);
	}

	public static void showCurrentTime() {
		// Obtain the total milliseconds since midnight, jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();

		// Obtain the total seconds since midnight, jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;

		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		// Obtain the total minute
		long totalMinute = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinute % 60;

		// Obtain the total hours
		long totalHour = totalMinute / 60;

		// Compute current hour
		long currentHour = totalHour % 24;

		// Display results
		System.out.println(
				" Current time is " + (currentHour + 3) + ":" + currentMinute + ":" + currentSecond + " GMT+3");

	}

	public static void salesTax() {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter purchase amount: ");
		double purchaseAmount = input.nextDouble();

		double tax = purchaseAmount * 0.06;
		System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
	}

}
