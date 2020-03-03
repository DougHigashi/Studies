package studies;

public class Todays_attempt {
	
	protected static boolean prime(int x) {
		for(int i=2; i<x; i++) {
			if(x % 2==0)
				return false;
		}
		return true;
	}
		
	public static void upToPrimes(int x) {
		for(int i=1; i<x; i++) {
			if(prime(i)==true)
				System.out.println(i);
				
		}
	}
	
	
	
}
