package src;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        StringBuilder output = new StringBuilder();

        do {
            System.out.print("Enter an integer: ");
            number = keyboard.nextInt();
        } while (number <= 0);

        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0 && i <= number / i) {
                output.append(i).append(", ").append(number / i).append(", ");
            }
        }

        System.out.printf("%n" + output.substring(0, output.length() - 2) + ".%n");
        keyboard.close();
    }
}