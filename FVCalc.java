// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int numyears = Integer.parseInt(args[0]);
		int CurrentValue = Integer.parseInt(args[1]);
		double IntrestRate = Double.parseDouble(args[2]);
		double FutureValue = CurrentValue * Math.pow(1 + IntrestRate / 100.0, numyears);
		System.out.println("After " + numyears + " years, " + CurrentValue + "$ saved at " + IntrestRate + "% will yield " + (int)(FutureValue) + "$");


	}
}