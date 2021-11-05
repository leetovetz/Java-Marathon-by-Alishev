package week01;

import java.util.Scanner;

public class LetterOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi. \nPlease enter two numbers \nfrom 0 to 100.");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > 0 && a < 100 && b > 0 && b < 100) {
            System.out.println("You entered numbers in the correct " +
                    "\nrange from 0 to 100. \nYour numbers: " + a + ", " + b);
            printCharacters(a, b);

        } else {
            System.out.println("Something went wrong. \n" +
                    "Let's try again entering two numbers " +
                    "\nin the range (0<n<100).");
        }

        scanner.close();

    }

    private static void printCharacters(int a, int b) {
        System.out.println("The result of the program: ");
        if (a > b) {
            for (int i = 1; i <= a; i++) {
                System.out.print("A");
            }
            for (int i = 1; i <= b; i++) {
                System.out.print("B");
            }
        }
        if (a < b) {
            for (int i = 1; i <= b; i++) {
                System.out.print("B");
            }
            for (int i = 1; i <= a; i++) {
                System.out.print("A");
            }
        }
        if (a == b) {
            for (int i = 1; i <= a; i++) {
                System.out.print("AB");
            }
        }
    }
}