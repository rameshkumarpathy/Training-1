import java.util.Scanner;

public class ScannerReadErrorDemov1 {

	public static void main(String[] args) {
		
		Scanner scanner = new
				Scanner(System.in);
		
		System.out.println("Enetr Some Number:");
		
		int number = scanner.nextInt();
		
		System.out.println("You have entered->" + number);
	}
}
