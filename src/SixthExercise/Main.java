package SixthExercise;

import java.util.Scanner;

/*
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
 */
public class Main {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a = s.nextInt();
		System.out.println("Enter second number: ");
		b = s.nextInt();
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

	}

}
