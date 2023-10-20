package java8;

public class Student {
	String name;
	int age;
//	static String school;             // static keyword to be use common keyword of instance value
	static String school = "Sincet";    // if i give main method in static value use class don't give the value.
	
	public String toString() {
		return (name+" "+age+" "+school);
	}

}
