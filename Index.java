package Exp1;

public class Index {
	public static void main(String[]args) {
		System.out.println ("Sha");
		
		String a = "WolFKinG";
		
		try {
			a.charAt(10);
		}
		catch (Exception b) {
			System.out.println("move");
			
//			b.printStackTrace();
		}
		finally {
			System.out.println("GO");
		}
		
		System.out.println("S");
		
		
	}

}
