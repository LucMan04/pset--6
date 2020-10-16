package src;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        int divisor = 0;
        int temp;
        do {
            System.out.print("Enter an integer: ");
            temp = keyboard.nextInt();
            if (temp >= 0) {
                sum += temp;
                divisor++;
            } else {
                break;
            }
        } while(true);
        double average = (double) sum / divisor;
        System.out.printf("%n%,.2f%n", average);
        keyboard.close();
    }
}