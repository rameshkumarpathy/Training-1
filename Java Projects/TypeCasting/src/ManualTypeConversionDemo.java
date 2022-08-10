
public class ManualTypeConversionDemo {

	public static void main(String[] args) {
	
		double d1 = 10.234;
		double d2 = 2.345;
		
		int x = (int) (d1 / d2);
		System.out.println("X's value is =" + x);
		
		long longValue = 123L;
		short shortValue = (short) longValue;
		System.out.println("Short's Value -> " +shortValue);
		
		longValue = 123456789L;
		shortValue = (short)longValue;
		System.out.println("Short's Value -> " +shortValue);
		
		byte aByte = 70;
		char charValue = (char) aByte;
		System.out.println(" Char Value ->" +charValue);
			
		
		
}
}
