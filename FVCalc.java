// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args)
	{
		// Replace this comment with your code
		int initialValue = Integer.parseInt(args[0]);
		double interest = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		double currentSum = initialValue * Math.pow((1 + interest / 100.0), years);

		System.out.println("After " + years + " years, $" + initialValue + " saved at " + (double)interest + "% will yield $" + currentSum);
	}
}