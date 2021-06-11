/*
Assessment: Assignment 2
Name: Soomin
Professor: Mel Sanschagrin
Section Number: CST8116 303
Due Date: 28-Feb-2021
*/
package assignment02;
import java.util.Scanner;

class EconomyFuel {
		
		private double miles;
				
		public double getMiles() {
			return miles;
		}
		public void setMiles(double miles) {
			this.miles = miles;
		}
}
	public class assignment02{
		
		public static void main(String[]args) {
			
			System.out.println("Distance of trip in miles: ");
			
			Scanner sc = new Scanner(System.in);
			double m = sc.nextDouble();
			
			double km = m * 1.61;
			double eco = (km * 6.8) / 100;
			
			System.out.println("Estimated distance in miles: " + m);
			System.out.println("Estimated distance in km: " + km);
			System.out.println("Fuel economy: " + Math.round(eco));
		}
	}
