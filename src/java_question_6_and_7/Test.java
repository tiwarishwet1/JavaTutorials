package java_question_6_and_7;

public class Test {
	public static void main(String[] args) {

		Student s1 = new Student(101, "Shwet", 85.5);
		Student s2 = new Student(102, "Max", 78.5);
		Student s3 = new Student(103, "Charles", 91.2);

		// Display student details using toString()

		System.out.println(s1);
		System.out.println("----------------------");

		System.out.println(s2);
		System.out.println("----------------------");

		System.out.println(s3);
		System.out.println("----------------------");

		System.out.println("Number of objects created: "
				+ Student.getObjectCount());

		// Using setter

		s1.setPercentage(90.0);

		// Using getter

		System.out.println("\nUpdated Percentage: "
				+ s1.getPercentage());

		System.out.println("\nUpdated Student Details:");
		System.out.println(s1);
	}
}
