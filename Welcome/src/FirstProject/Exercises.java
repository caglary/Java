package FirstProject;

import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Driver;
import java.sql.SQLException;
import java.sql.Statement;

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

	public static void computeLoad() {

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// enter annual interest rate in percentage, e.g., 7.25%
		System.out.println("Enter annual interest rate, e.g., 7,25% : ");
		double annualInterestRate = input.nextDouble();

		// Obtain montly interest rate
		double montlyInterestRate = (annualInterestRate / 1200);

		// Enter number of years
		System.out.println("Enter number of years as an integer, e.g., 5 : ");
		int numberOfYears = input.nextInt();

		// Enter loan amount
		System.out.println("Enter loan amount, e.g., 120000.95 : ");
		double loanAmount = input.nextDouble();

		// Calculate payment
		double montlyPayment = loanAmount * montlyInterestRate
				/ (1 - 1 / Math.pow(1 + montlyInterestRate, numberOfYears * 12));
		double totalPaymet = montlyPayment * numberOfYears * 12;

		// Display result
		System.out.println("The montly payment is $" + (int) (montlyPayment * 100) / 100.0);

		System.out.println("The total payment is $" + (int) (totalPaymet * 100) / 100.0);
	}

	public static void differentForDividedByIntAndDouble() {
		System.out.println("avarage of numbers 1 and 2 defined as integer ");
		int number1 = 1;
		int number2 = 2;
		double average = (number1 + number2) / 2;
		System.out.println("divided by integer (2): " + average);

		average = (number1 + number2) / 2.0;
		System.out.println("divided by double (2.0): " + average);
	}

	public static void connectMysql() {

		try {

			Connection connectionDb = DriverManager.getConnection("jdbc:mysql://localhost:3306/deneme", "root", "");
			System.out.println("bağlandı");
			Statement statement = connectionDb.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from musteries");
			while (resultSet.next()) {
				System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
			}
			// Do something with the Connection

		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}

	}

	public static void artikYil() {
		Scanner klavye = new Scanner(System.in);

		System.out.println("Bir yıl giriniz... : ");
		int yil = klavye.nextInt();

		boolean artikYilMi = yil % 4 == 0;

		artikYilMi = artikYilMi && yil % 100 != 0;
		artikYilMi= artikYilMi || yil%400==0;
		
		if(artikYilMi) {
			System.out.println(yil + " artık yıldır.");
		}else {
			System.out.println(yil + " artık yıl değildir.");
		}
		
	
	}
}
