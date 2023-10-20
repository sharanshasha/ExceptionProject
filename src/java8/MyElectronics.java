package java8;

public class MyElectronics implements Electronics{
		public String status (boolean a) {
			if(a==true) {
				return "Working";
			}
			else {
				return "Not Working";
			}
		}
		
		public void price (int ab) {      //its Over ride and implement.
			System.out.println(ab+100);
		}
}
