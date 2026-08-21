import com.mindcraft.pack1.Student;
import com.mindcraft.pack2.Batch;

public class Test {

	public static void main(String[] args) {

		Student s = new Student(101, "Shwet");

		Batch b = new Batch("Java", 30);

		System.out.println("Student Details:");
		s.display();

		System.out.println("------------------");

		System.out.println("Batch Details:");
		b.display();
	}
}