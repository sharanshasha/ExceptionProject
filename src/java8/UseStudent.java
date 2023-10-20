package java8;

public class UseStudent {
	public static void main(String[]args) {
//		Student.school = "Tiny Tots";
		
		Student a = new Student();
		a.name = "Sha";
		a.age = 10;
		
		Student b = new Student();
		b.name = "Hen";
		b.age = 11;
		
		System.out.println(a+"\n"+b);
	}

}
