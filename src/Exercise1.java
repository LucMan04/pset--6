package src;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int sum = 0;

        System.out.print("\nLower bound: ");
        int lowerBound = keyboard.nextInt();

        System.out.print("Upper bound: ");
        int upperBound = keyboard.nextInt();

        while (lowerBound >= upperBound){
            System.out.print("\nLower bound: ");
            lowerBound = keyboard.nextInt();

            System.out.print("Upper bound: ");
            upperBound = keyboard.nextInt();
        }
        for (int i = lowerBound; i < upperBound; i++) {
            if (i % 2 == 0) {
                sum = i + sum;
            }
        }

        DecimalFormat df2 = new DecimalFormat("#.##");
        df2.setGroupingUsed(true);
        df2.setGroupingSize(3);
        System.out.println("\n" + df2.format(sum) + ".");

        keyboard.close();
    }
}