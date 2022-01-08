package FifthExercise;

import java.util.Scanner;

public class Main {
/*
 * Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input first number: 5
 */
	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a = s.nextInt();
		System.out.println("Enter second number: ");
		b = s.nextInt();
		
		System.out.println("Input first number: "+ a);
		System.out.println("Input first number: "+ b);

	}

}
