// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int CurrentValue = Integer.parseInt(args[0]);
		double IntrestRate = Double.parseDouble(args[1]);
		int numyears = Integer.parseInt(args[2]);
		double FutureValue = CurrentValue * Math.pow(1 + IntrestRate / 100.0, numyears); //A double which calculates the future value
		System.out.println("After " + numyears + " years, $" + CurrentValue + " saved at " + IntrestRate + "% will yield $" + (int)(FutureValue) + ".");


	}
}