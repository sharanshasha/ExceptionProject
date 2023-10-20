package java8;

public class StaticEx {
	//static int counter = 0;
	 int counter = 0;
	
	public StaticEx() {
		counter++;
		System.out.println(counter);
		
	}
	
	static {
		System.out.println("This is Static");
	}

}
