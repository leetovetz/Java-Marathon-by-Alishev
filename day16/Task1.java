package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("input.txt");

        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numders = line.split(" ");
            scanner.close();

            int sum = 0;

            for (String number : numders) {
                sum += Integer.parseInt(number);
            }

            double result = sum / (double) numders.length;

            System.out.printf(result + " --> %.3f", result);

            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("File not found. ");
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect input file.");
        }
    }
}
