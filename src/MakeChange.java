import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double price = 0.0;
		double givenAmount = 0.0;
		double change = 0.0;
		double penny = 0.01;
		double nickle = 0.05;
		double dime = 0.10;
		double quarter = 0.25;
		double dollar = 1.00;
		double five = 5.00;
		double ten = 10.00;
		double twenty = 20.00;

		System.out.println("Enter the price of the item: ");
		price = scan.nextDouble();

		System.out.println("How much did the customer give? ");
		givenAmount = scan.nextDouble();

		change = givenAmount - price;

		int numTwenties = 0;
		int numTens = 0;
		int numFives = 0;
		int numOnes = 0;
		int numQuarters = 0;
		int numDimes = 0;
		int numNickles = 0;
		int numPennies = 0;

		if (givenAmount > price) {

			numTwenties = (int) (change / twenty);
			change %= twenty;

			numTens = (int) (change / ten);
			change %= ten;

			numFives = (int) (change / five);
			change %= five;

			numOnes = (int) (change / dollar);
			change %= dollar;

			numQuarters = (int) (change / quarter);
			change %= quarter;

			numDimes = (int) (change / dime);
			change %= dime;

			numNickles = (int) (change / nickle);
			change %= nickle;

			numPennies = (int) Math.round(change / penny);
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
