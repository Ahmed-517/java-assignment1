package assignmet1;
import java.util.*;

/*
 * Ahmed Gamal Goda
 * ID: 211902083
*/

public class Main {
	static void func() {
		Scanner scan = new Scanner(System.in);
		String line = "-------------------------\n";
		
		System.out.print("Enter distance in meters: ");
		float distance = scan.nextFloat();
		System.out.print(line);
		
		System.out.print("Enter Hours: ");
		int tHou = scan.nextInt();
		System.out.print("Enter Minutes: ");
		int tMin = scan.nextInt();
		System.out.print("Enter Seconds: ");
		int tSec = scan.nextInt();
		System.out.print(line);
		
		// Create an object
		Speed speed = new Speed(distance, tHou, tMin, tSec);
		
		// The Result
		System.out.println(speed);
		System.out.println(line);
		
		// Repetition
		System.out.print("enter 1 to start the program again: ");
		int x = scan.nextInt();
		if (x == 1)
			System.out.println(line);
			func();
			
		scan.close();
	}
	
	public static void main(String[] args) {
		func();
	}
}
