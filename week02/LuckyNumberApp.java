package lectures.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyNumberApp {

    public static void main(String[] args) {
        int[] luck = new int[6];

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Please, enter your number: ");
            char[] chars = reader.readLine().toCharArray();

            if (chars.length % 2 != 0) {
                System.out.println("Your number should be an even number. Try entering it again. ");
            } else {
                for (int i = 0; i < chars.length; i++) {
                    luck[i] = Integer.parseInt(String.valueOf(chars[i]));
                }
                boolean luckyTicket = luck[0] + luck[1] + luck[2] == luck[3] + luck[4] + luck[5];

                System.out.println("The number " + String.valueOf(chars) +
                        (luckyTicket ? " is " : " is not ") + "a lucky ticket.");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error! Enter a number.");
        }
    }
}

