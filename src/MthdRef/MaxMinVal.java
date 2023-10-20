package MthdRef;

public class MaxMinVal {             
	public int Max(int[] ac) {                 // its Default Method 
		int max = ac[0];
		for(int i=0; i<ac.length; i++) {
			if(max<ac[i]) {
				max = ac[i];
			}
		}
		return max;
	}
	
	public static int Min (int[] bd) {           // its static Method
		int min = bd[0];
		for(int c : bd) {
			if(c<min) {
				min = c;
			}
		}
		return min;
	}

}
