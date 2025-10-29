// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * range);// generates a random integer between 0 and range 
		int b = (int) (Math.random() * range);
		int c = (int) (Math.random() * range);
		System.out.println("Generated numbers: " + a + " " + b + " " + c);
		int first, second, third;
		first = Math.min(a, Math.min(b, c)); //finds the smallest number
		third = Math.max(a, Math.max(b, c)); //finds the largest number
		second = a+b+c - first - third;	//finds the middle number by subtracting smallest and largest from the sum of all three
		System.out.println("In ascending order: " + first + " " + second + " " + third);
	
	}
}
