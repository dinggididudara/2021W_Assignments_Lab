package LabExercise04;
import java.util.Scanner;

	class Info{
	private String name;
	private String number;
	private double gpa;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}
	public class LabExercise04 {
		final static Scanner SC = new Scanner(System.in);
	public static void main(String[]args) {
		Info sInfo = new Info();
		
		System.out.println("What is your full name?");
		String name = SC.nextLine();
		
		System.out.println("What is your student number?");
		String number = SC.nextLine();
		
		System.out.println("What is your average GPA?");
		double gpa = SC.nextDouble();
		
		sInfo.setName(name);
		sInfo.setNumber(number);
		sInfo.setGpa(gpa);
		
		System.out.println(sInfo.getName() + " " + sInfo.getNumber() +"  "+ sInfo.getGpa());
		System.out.println("This program is programmed by Soomin Lee");
	}
}