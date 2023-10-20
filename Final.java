package Exp1;

public class Final {
	public static void main(String[]args) {
		System.out.println("Sha");
		
		String a = "TN51";
		
		try {
			int b = Integer.parseInt(a);
			System.out.println(b);
		}
		
//		catch (Exception c) {
//			System.out.println(c);
//			                                     // if i active this method to be exception is activated to throw the value.
//			c.printStackTrace();
//		}                                      // if i give the catch command on first shows the catch value first and show finally value.
		
		finally {
			System.out.println("Go");           // this method was immediately throw the message and show the error and its stop on finally 
		}                                       // message and show on try command error shows.
		
		System.out.println("KinG");
	}

}
