package Exp1;

//Customize Method.

public class Thro {
	public static void main (String[]args) throws Age {
		String a = "ShaHen";
		int age = 25;
			if(age>=18) {
				System.out.println("Welcome"+" "+a);
			}
			else {
				throw new Age ("Not Valid");
			}
		String gender = "Male";
		System.out.println(gender);
	}
}

class Age extends Exception {          // Bean Class
	
	public Age (String msg) {
		super (msg);
	}
}





