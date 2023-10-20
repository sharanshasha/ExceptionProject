package Exp1;

public class Null {
	public static void main(String[]args) {
		System.out.println("SHa");
		
		String s = null;
		
		System.out.println(s);

		try {
		System.out.println(s.toUpperCase()); //to gives a specific keyword gives thats shows on error.
		}
		
		catch (Exception q) {
			System.out.println("Move");
			
//			q.printStackTrace();
		}
		System.out.println("Hi");
		
	}

}
