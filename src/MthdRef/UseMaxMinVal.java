package MthdRef;

public class UseMaxMinVal {
	public static void main(String[]args) {
		MaxMinVal m1 = new MaxMinVal();                     // default method to create a object and get a output value
		MaxMin a = m1::Max;                                // :: its a Method Reference symbol  // m1 is a object name
		int[] num = {10,20,30,40,50};                          
		System.out.println(a.find(num));
		
		MaxMin b = MaxMinVal::Min;                           // static method so don't create a object directly to get a output
		System.out.println(b.find(num));                     // (= next) class name :: method name to call and easy to handle
	}

}
