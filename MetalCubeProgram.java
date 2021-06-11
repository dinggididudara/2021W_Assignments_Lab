/*
Assessment: Assignment 3
Name: Soomin
Professor: Mel Sanschagrin
Section Number: CST8116 303
Due Date: 28-Mar-2021
*/

	//package cube + import Scanner
package cube;
import java.util.Scanner;

	//ToDo: class metal cube program
public class MetalCubeProgram{
	public static void main(String[]args) {
		
	//ToDo: class metal cube analyzer		
		class MetalCubeAnalyzer{
			void enterCube(){
				System.out.println("Boundary: ");
				Scanner sc = new Scanner(System.in);
				double bounds = sc.nextDouble();
				
		
			}
		}

	//ToDo: class metal cube - check within tolerance or not 
	//use: if/else / boolean
		class MetalCube{
			double boundsMC = bounds.new MetalCubeAnalyzer();
			
			boolean isWithinTolerance(){
				
				if(boundsMC == 10.00) {
					System.out.println("Within Tolerance");
					System.out.println("Programmed by Soomin Lee");
					return true;
					}
				else{
					System.out.println("Out of Tolerance");
					System.out.println("Programmed by Soomin Lee");
					return false;
					}
				
			}
		}
	}
}