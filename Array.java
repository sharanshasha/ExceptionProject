package Exp1;

               // Array Index out of bounds Exception

public class Array {
	public static void main(String[]args) {
		System.out.println("KinG");
		
		int[] a = {1,2,3,5,4,6,9,8,7};
		
		try {
//			System.out.println(a[5]);   //if i gives the value in array index size inside no error occur. i got my output.
			
			System.out.println(a[10]);       //if i gives the value in array index size outside error occur. i don't got my output.
		}
		
		catch (Exception b) {
			System.out.println("Leave it");
		}
		
		System.out.println("OK");
		System.out.println("Everything Ok");
	}
		

}
