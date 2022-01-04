package lectures.week02;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your number: ");
        String luckyNumber = sc.next();

        int x = Integer.parseInt(luckyNumber);
        int[] numbs = new int[luckyNumber.length()];
        for (int i = luckyNumber.length() - 1; i >= 0; i--) {
            numbs[i] = x % 10;
            x /= 10;
        }
        int length = numbs.length;

        if (length % 2 != 0) {
            System.out.println("Your number should be an even number. Try entering it again. ");

        } else {
            char charArray[] = Integer.toString(x).toCharArray();
            char firstPart[] = Integer.toString(x).substring(0, charArray.length / 2).toCharArray();
            char secondPart[] = Integer.toString(x).substring(charArray.length / 2, charArray.length).toCharArray();

            int firstSumm = 0;
            int secondSumm = 0;

            for (char c : firstPart) {
                firstSumm += Integer.parseInt(String.valueOf(c));

            }
            for (char c : secondPart) {
                secondSumm += Integer.parseInt(String.valueOf(c));

                if (firstSumm == secondSumm) {
                    System.out.println("Congratulations. Your ticket is a lucky one!!!");
                    System.out.println(firstSumm);
                    System.out.println(secondSumm);
                } else {
                    System.out.println("Sorry. Your ticket is not a lucky one. ");
                    System.out.println(firstSumm);
                    System.out.println(secondSumm);

                }


            }

        }
        System.out.println(luckyNumber);
        System.out.println(length);
    }
}
