/*
 * Assessment: Exercise 01
 * Student Name: lee00665
 * Due Date: 22-Jan-2021
 * Description: A simple program to output a name and the date and time.
 * Professor Name: Mel Sanschagrin
 */
import java.util.Date;
import java.text.DateFormat;

/* A simple class that outputs a greeting to the console. */
public class Greeting{

    /* Entry point for the application. */
    public static void main(String[] args){
	Date todayDateTime = new Date();
	DateFormat dateFormat = DateFormat.getDateTimeInstance();
        System.out.println("Hello, my author's name is " + "Soomin");
        System.out.println("Today is: " + dateFormat.format(todayDateTime));
    }
}
