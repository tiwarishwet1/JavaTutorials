package java_basics_question4;

public class Addition {
	public int add(int... values) {

        int totalSum = 0;

        for (int value : values) {
            totalSum += value;
        }

        return totalSum;
    }

    public static void main(String args[]) {

        Addition a  = new Addition ();

        int sum1 = a.add();
        System.out.println("Sum = " + sum1);

        int sum2 = a.add(10, 20);
        System.out.println("Sum = " + sum2);

        int sum3 = a.add(10, 20, 30);
        System.out.println("Sum = " + sum3);

        int sum4 = a.add(10, 20, 30, 40, 50);
        System.out.println("Sum = " + sum4);
    }
}
