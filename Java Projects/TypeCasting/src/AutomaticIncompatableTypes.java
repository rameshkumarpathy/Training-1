
public class AutomaticIncompatableTypes {

	public static void main(String[] args) {
		boolean condition = False;
		float F = condition;
		
		System.out.println("Float Value is ->" + F);
		
		double d = 10.12345;
		char c = d;
		System.out.println("Character Value ->" + c);
	}
}
