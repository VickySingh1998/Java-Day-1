package stringEqual;

import java.util.Scanner;

public class string {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First String:");
		String st1= sc.nextLine();
		System.out.print("Enter First String:");
		String st2= sc.nextLine();
		
		if (st1==st2) {
			System.out.print("The String Is Equal");
		else 
			System.out.print("The String Is Not Equal");
		}
		
		
	}
}
