import java.util.Scanner;

public class ScannerReadErrorDemov2 {

	public static void main(String[] args) {
		
		Scanner scanner = new
				Scanner(System.in);
		
		System.out.println("Enetr Some Number:");
		
		
		boolean isAnIntegerValue = scanner.hasNextInt();

		if (isAnIntegerValue) {
			
		
		int number = scanner.nextInt();
		
		System.out.println("You have entered->" + number);
		}else {
			
			System.out.println("You are expected to enter integer value");
		}
	}
}
