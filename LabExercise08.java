/*
Assessment: Lab Exercise 8
Name: Soomin
Professor: Mel Sanschagrin
Section Number: CST8116 303
*/
public class LabExercise08{
	public static void main(String[]args) {
		int[] arr = {1, 2, 3, 5, 7};
		int sum = 0;
				
		for(int a = arr.length-1; a >= 0;a--) {
			System.out.print(arr[a] + " ");
			sum += arr[a];				
			}
		System.out.println("");
		System.out.println("Sum: " + sum);
		System.out.println("Program by Soomin Lee");
		}
	}
