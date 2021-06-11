/*
 * Assessment: Assignment 01
 * Student Name: Soomin
 * Due Date: Week 4
 * Description: 
 * Professor Name: Mel Sanschagrin
 */
import java.util.Scanner;

public class assignment_1{
	public static void main(String[]args) {
		
		System.out.println("Please type numbers between 1 to 10");
		
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		
		double x = a.nextDouble();
		double y = b.nextDouble();
		double z = c.nextDouble();
		
		
		System.out.println(Math.pow(x, y));
		System.out.println(Math.pow(y, z));
		System.out.println(Math.pow(z, x));
		
		double sum = x + y + z;
		
		System.out.println("Sum is : " + sum);
		System.out.println("Average is : " + sum/3);
		
		
		System.out.println("Soomin Lee");
		
		
	}
}