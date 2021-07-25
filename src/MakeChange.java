import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double price = 0.0;
		double givenAmount = 0.0;

		System.out.println("Enter the price of the item: ");
		price = scan.nextDouble();

		System.out.println("How much did the customer give? ");
		givenAmount = scan.nextDouble();
		scan.close();
		double nickle = 0.05;
		double dime = 0.10;
		double quarter = 0.25;
		double dollar = 1.00;
		double five = 5.00;
		double ten = 10.00;
		double twenty = 20.00;
		double change = givenAmount - price;
		System.out.println("the customer gave: " + givenAmount + " the price is: " + price + " change due is: "
				+ (double) Math.round(change * 100) / 100);
		double penny = 0.01;

		if (givenAmount > price) {

			int numTwenties = (int) (change / twenty);
			change %= twenty;

			int numTens = (int) (change / ten);
			change %= ten;

			int numFives = (int) (change / five);
			change %= five;

			int numOnes = (int) (change / dollar);
			change %= dollar;

			int numQuarters = (int) (change / quarter);
			change %= quarter;

			int numDimes = (int) (change / dime);
			change %= dime;

			int numNickles = (int) (change / nickle);
			change %= nickle;

			int numPennies = (int) Math.round(change / penny);
			change %= penny;

			System.out.println("Change due is: " + numTwenties + " twenties " + numTens + " tens " + numFives
					+ " fives " + numOnes + " ones " + numQuarters + " quarters " + numDimes + " dimes " + numNickles
					+ " nickles " + numPennies + " pennies.");

		}
		if (givenAmount < price) {
			System.out.println(" ERROR : The price is " + price + " you have only given " + givenAmount);
		} else if (price == givenAmount) {
			System.out.println("Exact change!");

		}

	}
}
