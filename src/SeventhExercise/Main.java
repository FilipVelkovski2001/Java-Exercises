package SeventhExercise;

import java.util.Scanner;
/*
 * Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
 */
public class Main {

	public static void main(String[] args) {
		int a;
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number: ");
		a = s.nextInt();
		
		System.out.println(a * 1);
		System.out.println(a * 2);
		System.out.println(a * 3);
		System.out.println(a * 4);
		System.out.println(a * 5);
		System.out.println(a * 6);
		System.out.println(a * 7);
		System.out.println(a * 8);
		System.out.println(a * 9);
		System.out.println(a * 10);
		

	}

}
