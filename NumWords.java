// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
int n = Integer.parseInt(args[0]);
int hundreds = (n%1000)/100;
int tens = (n%100)/10;
int units = n % 10;
System.out.print(hundreds + " hundred ");
System.out.print(tens + " ten ");
System.out.print(units + " unit");
}
}
