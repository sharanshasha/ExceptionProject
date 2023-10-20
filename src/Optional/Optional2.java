package Optional;

import java.util.Optional;

public class Optional2 {
	public static void main(String[]args) {
		String a = "null";             
		Optional<String> check = Optional.ofNullable(a);   
//		if(check.isPresent()) {                             //if i have a input value to use isPresent() method 
			if(check.isEmpty()) {                            // if i have empty value or need to empty to use this method
		System.out.println(a.toUpperCase());
		}
		else {
			System.out.println("The value is Empty");
		}
	}

}
