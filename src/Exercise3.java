package src;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter an integer: ");
            number = scan.nextInt();
        } while (number <= 0);
        String numString = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i <= numString.length() - 1; i++) {
            if (numString.charAt(i) % 2 == 1) {
                sum += Character.getNumericValue(numString.charAt(i));
            }
        }
        System.out.printf("%n" + sum + ".%n");
    }
}