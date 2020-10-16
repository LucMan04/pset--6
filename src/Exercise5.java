package src;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter an integer: ");
            number = keyboard.nextInt();
        } while (number < 0);

        if (number == 0 || number == 1) {
            System.out.printf("%nNot prime.%n");
        } else if (number == 2 || number == 3) {
            System.out.printf("%nPrime.%n");
        } else if (number % 2 == 0 || number % 3 == 0) {
            System.out.printf("%nNot prime.%n");
        } else {
            for(int i = 5; i <= Math.sqrt(number); i += 6) {
                if (number % i == 0 || number % (i + 2) == 0) {
                    System.out.printf("%nNot prime.%n");
                    return;
                }
            }
            System.out.printf("%nPrime.%n");
        }
        keyboard.close();
    }
}