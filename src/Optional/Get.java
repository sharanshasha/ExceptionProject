package Optional;

import java.util.Optional;

public class Get {
	public static void main(String[]args) {
		Optional <String>name = Optional.ofNullable(null);
//		System.out.println(name.get());           // the get() method to be using to throw the value
//		System.out.println(name.orElse("This is Nothing"));        // its throw the exception and i give the message to sent output
		System.out.println(name.orElseThrow(()->new NullPointerException()));
	}

}
