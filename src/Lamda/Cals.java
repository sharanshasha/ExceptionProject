package Lamda;

//Functional Interface 

public interface Cals {
	public int find (int a, int b);
	
	public static String name() {
		return "addition";
	}
	public default void progress() {
		System.out.println("Arithmetic");
	}

}
