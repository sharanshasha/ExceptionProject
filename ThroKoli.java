package Exp1;

public class ThroKoli {
	public static void main(String[]args) throws Kholi {
		String a = "King";
		int age = 30;
		if (a.equalsIgnoreCase("King")) {
			System.out.println("Welcome"+" "+a);
		}
		else {
			throw new Kholi ("You are Not a Kholi");
		}
		String who = "Kholi";
		System.out.println(who);
	}

}

class Kholi extends Exception {
	public Kholi (String cricketer) {
		super (cricketer);
	}

}