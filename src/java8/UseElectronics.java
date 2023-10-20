package java8;

public class UseElectronics {
	public static void main(String [] args) {
		MyElectronics a = new MyElectronics();
		System.out.println(a.status(true));
		a.price(500);
		
		System.out.println(Electronics.name());
		
		
		
	}

}
