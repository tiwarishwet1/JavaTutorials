package java_question_6_and_7;

public class Student {

	private int rollNo;
	private String name;
	private double percentage;

	private static int objectCount = 0;

	public Student(int rollNo, String name, double percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;

		objectCount++;
	}


	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}


	public static int getObjectCount() {
		return objectCount;
	}


	@Override
	public String toString() {

		return "Roll No: " + rollNo
				+ "\nName: " + name
				+ "\nPercentage: " + percentage;
	}
}