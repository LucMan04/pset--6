package src;

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
            sum = i + sum;
        }
        System.out.println();
        System.out.println(sum+".");
    }
}