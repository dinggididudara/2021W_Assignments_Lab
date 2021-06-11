import java.util.Scanner;

public class exercise03{
	public static void main(String[]args){
		
		System.out.println("What is your name?");
		
		Scanner username = new Scanner(System.in);
		String name = username.nextLine();
		System.out.println("Your name is : " + name);
		System.out.println("Length is : " + name.length());
		System.out.println(name.toUpperCase());
		
		System.out.println("Program by Soomin Lee");

	}
}