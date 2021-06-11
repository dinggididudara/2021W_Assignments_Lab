//ToDo: Programmer comments top of file as per lecture notes week 1.
/* Assessment: Lab Exercise 07
   Name: Soomin LEe
   Professor: Mel Sanschagrin
   Section Number: CST8116 303
   Due Date: 26-Mar-2021
 */
package epsilon;
import java.util.Scanner;

/*
 * Author: Professor Stanley Pieda
 * Description: Starter Code for Exercise 07 (21W) CST8116
 * Copyright (c) Algonquin College 2021
 */
import java.util.Scanner;

/*
 * This class has two methods for collecting numbers from a console,
 * both methods verify that the data is numerical, or the person
 * using the console will be prompted for an acceptable number until they
 * provide one. 
 */
class User {
	private final static Scanner KEYBOARD = new Scanner(System.in);
	
	public static double inputDouble(){
			
			for(int i=0; i<3 ;i++) {
				double value = 0.0;
				
				while( ! KEYBOARD.hasNextDouble() ) {
					System.out.println("Invalid input, expecting decimal-point number");
					System.out.print("Please enter a decimal-point number:");
					KEYBOARD.nextLine(); // clean out bad data
				}
				value = KEYBOARD.nextDouble();
				KEYBOARD.nextLine(); // clean up the input stream
				return value;
			}
			return 0;
	}
}

public class EpsilonTester {
	private double test; 
	private double target; 
	private double epsilon; 

	public EpsilonTester() {
		this(0.0, 0.0, 0.0);
	}

	public EpsilonTester(double test, double target, double epsilon) {
		setTest(test);
		setTarget(target);
		setEpsilon(epsilon);
	}

	public double getTest() {
		return test;
	}

	public void setTest(double test) {
		this.test = test;
	}

	public double getTarget() {
		return target;
	}

	public void setTarget(double target) {
		this.target = target;
	}

	public double getEpsilon() {
		return epsilon;
	}

	public void setEpsilon(double epsilon) {
		this.epsilon = epsilon;
	}

	public String compareWithEquality() {
		boolean result = test == target;
		String report = generateReport("Testing with: target == test", result);
		return report;
	}
	
	public String compareWithEpsilon() {
		boolean result = Math.abs(target - test) <= epsilon;
		String header = String.format(
				"Testing with: Math.abs(target - test) <= epsilon%n"
				+ "value of epsilon is: %.14f", epsilon);
		String report = generateReport(header, result);
		return report;
	}
	
	public void interactWithUserForFieldValues() {
		double value = 0; // used for target, test, epsilon in sequence
		
		System.out.print("Enter target number: ");
		value = User.inputDouble();
		setTarget(value);

		System.out.print("Enter test number: ");
		value = User.inputDouble();
		setTest(value);

		System.out.print("Enter epsilon e.g. 1E-1 to 1E-14: ");
		value = User.inputDouble();
		setEpsilon(value);
	}
	
	private String generateReport(String header, boolean result) {
		String report = header;
		report += String.format("%n");
		report += String.format("%s %.14f%n", "test number: ",test);
		report += String.format("%s %.14f%n", "target number: ", target);
		report += String.format("%s %.14f%n", 
				"absolute difference: ", Math.abs(target - test));
		report += String.format("Considered equal?: %b",result);
		return report;
	}

	public static void main(String[] args) {
		
		EpsilonTester epsilonTester = new EpsilonTester();
		final String CONTINUE_PROGRAM = "1"; // use this for the loop
		String report = ""; // used for outputs
		String con;
		
        do{
        	epsilonTester.interactWithUserForFieldValues();

        	System.out.println();
        	report = epsilonTester.compareWithEquality();
        	System.out.println(report);
		
        	System.out.println();
        	report = epsilonTester.compareWithEpsilon();
        	System.out.println(report);
		
        	System.out.println("\nProgram by Soomin Lee");
        	
        	System.out.println("Enter 1 to run another test");
        	Scanner sc = new Scanner(System.in);
        	con = sc.nextLine();
		
        	
        	} while(con.equals(CONTINUE_PROGRAM));
        	System.out.println("Program has exited");
			}
		}
