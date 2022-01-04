package lectures.week02;

import java.util.Scanner;

public class CalculateChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of coins you have: ");
        int userPaidCoins = scanner.nextInt();
        System.out.println("Please enter the purchase amount in coins: ");
        int itemPriceCoins = scanner.nextInt();
        scanner.close();

        int changeCoins = userPaidCoins - itemPriceCoins;

        if (userPaidCoins < 0 || userPaidCoins > 1000 || itemPriceCoins < 0 || itemPriceCoins > 1000) {
            System.out.println("Something went wrong. \n" +
                    "Let's try again entering two numbers " +
                    "\nin the range (0<n<1000).");
        }
        if (itemPriceCoins > userPaidCoins) {
            changeCalculation(userPaidCoins);
        } else {
            changeCalculation(changeCoins);
        }
    }

    private static void changeCalculation(int changeCoins) {
        final int TWO_DOLLARS = 200;
        final int ONE_DOLLAR = 100;
        final int FIFTY_CENTS = 50;
        final int TWENTY_FIVE_CENTS = 25;
        final int TEN_CENTS = 10;
        final int TWO_CENTS = 2;
        final int ONE_CENT = 1;

        int twoDollars = changeCoins / TWO_DOLLARS;
        changeCoins = changeCoins % TWO_DOLLARS;

        int oneDollar = changeCoins / ONE_DOLLAR;
        changeCoins = changeCoins % ONE_DOLLAR;

        int fiftyCents = changeCoins / FIFTY_CENTS;
        changeCoins = changeCoins % FIFTY_CENTS;

        int twentyFiveCents = changeCoins / TWENTY_FIVE_CENTS;
        changeCoins = changeCoins % TWENTY_FIVE_CENTS;

        int tenCents = changeCoins / TEN_CENTS;
        changeCoins = changeCoins % TEN_CENTS;

        int twoCents = changeCoins / TWO_CENTS;
        changeCoins = changeCoins % TWO_CENTS;

        int oneCent = changeCoins;

        System.out.println("You have to give out this kind of change:");
        System.out.printf("two Dollars      : %d%n", twoDollars);
        System.out.printf("one Dollar       : %d%n", oneDollar);
        System.out.printf("fifty Cents      : %d%n", fiftyCents);
        System.out.printf("twentyFive Cents : %d%n", twentyFiveCents);
        System.out.printf("ten Cents        : %d%n", tenCents);
        System.out.printf("two Cents        : %d%n", twoCents);
        System.out.printf("one Cent         : %d%n", oneCent);
    }
}