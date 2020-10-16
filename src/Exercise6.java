package src;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int count;
        int numNow = 1;
        int numPrev = 0;
        int temp;
        do {
            System.out.print("Enter an integer: ");
            count = keyboard.nextInt();
        } while (count < 0 || count > 92);
        if (count == 0) {
            System.out.printf("%n0.%n");
        } else {
            for (int i = count; i > 1; i--) {
                temp = numNow;
                numNow += numPrev;
                numPrev = temp;
            }
        }
        System.out.printf("%n%,d.%n", numNow);
        keyboard.close();
    }
}
