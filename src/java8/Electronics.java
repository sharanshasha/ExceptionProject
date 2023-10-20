package java8;

public interface Electronics {
	public String status (boolean a);
	
	public static String name() {  //static was implement but don't do override.
		return "Mobile";
	}
	public default void price (int price) {     //default was implement & override.
		System.out.println(price);
	}

}
