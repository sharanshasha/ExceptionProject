package Lamda;

public class UseCals {
	public static void main(String[]args) {              //Lambda Expression(->) to use with got a output 
		Cals add = (x,y) -> x+y;
		System.out.println(add.find(10, 5));
	}

}
