package Optional;

import java.util.Optional;

public class Optional1 {
	public static void main(String[]args) {
		
	String a = null;
	//Optional<String> check = Optional.of(a);               //its working on compulsory have a input value its throw Exception
	Optional<String> check = Optional.ofNullable(a);         //its working on input value found or not but its accept and working.
	System.out.println(check);
	}

}
