/* Section:		 CST8116 303
 * Professor:	 MEL SANSCHAGRIN
 * Assignment:   LabExercies06
 * Name: 		 Soomin Lee
*/

import java.util.Scanner;

public class LabExercise06{
	public static void main(String[]args) {
		System.out.println("Enter weight(kg): ");
		Scanner weightsc = new Scanner(System.in);
		double weight = weightsc.nextDouble();
			//== is address		
		if(weight > 0) {
			System.out.println("Enter 1 to ship by truck");
			System.out.println("Enter 2 to ship by train");
			System.out.println("Enter 3 to ship by plane");
		
			System.out.println("Enter Shipping method: ");
			Scanner shipsc = new Scanner(System.in);
			int ship = shipsc.nextInt();
				if(ship == 1) {
					double wdollar = weight * 0.10 + 10;
					System.out.println("Shipping by truck costs: " + Math.ceil(wdollar));
				}
				if(ship == 2) {
					double wdollar = weight * 0.25 + 10;
					System.out.println("Shipping by train costs: " + Math.ceil(wdollar));
				}
				if(ship == 3) {
					double wdollar = weight * 0.75 + 10;
					System.out.println("Shipping by plane costs: " + Math.ceil(wdollar));
				}
		 	}
		 	else {
			 System.out.println("Error");
		 	}
		 System.out.println("Program by Soomin Lee");
	}
}