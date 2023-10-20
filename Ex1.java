package Exp1;

public class Ex1 {
	public static void main(String[]args) {
		System.out.println("Sha");
		
		int a = 10;
		int b = 0;
		try {
		System.out.println(a/b);
		}
		
		catch(Exception c) {
			System.out.println("Don't divide number by 0"); // own command.
			
//			System.out.println(c); //shows on handle.
			
//			c.printStackTrace(); //shows on handle with details
		}
		
		System.out.println("Hi");
	}

}
