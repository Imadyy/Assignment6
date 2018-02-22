// Imad Merveil
//Write a main method that prompts the user to enter the side of a pentagon and
//displays its area. Here is a sample run:
import java.util.Scanner;
public class Chapter6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	
		//Prompt the user to enter the side of a pentagon
		System.out.println("Enter the side of the pentagon: ");
		double side = input.nextDouble();
		
		// Display the pentagon's area
		System.out.println("The area of the pentagon is " + area(side));
	}
		public static double area (double side) {
			return (5 * Math.pow(side,2)) / (4* Math.tan(Math.PI / 5));
		}
		
}
