import java.util.Scanner;

//import java.lang.System;

public class ScannerDemo1 {

	public static void main(String[] args) {
		
		Scanner scanner = new
				Scanner(System.in);
		
		System.out.println("Enetr Some Text:");
		
		String text = scanner.nextLine();
		
		System.out.println("You have entered->" + text);
				
	}
}
