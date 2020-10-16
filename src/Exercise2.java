package src;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter an integer: ");
            number = keyboard.nextInt();
        }
        while (number < 0);


        String value = Integer.toString(number);

        char[] array = value.toCharArray();
        for (int k = 0; k < array.length/2; k++) {
            int temp = Character.getNumericValue(array[k]);
            array[k] = array[array.length- k - 1];
            array[array.length - k - 1] = Character.forDigit(temp, 10);
            temp++;
        }

        for (int e = 0; e < array.length - 1; e++){
            System.out.print(array[e] + ", ");
        }

        System.out.print(array[array.length-1]);
        System.out.println(".");
        keyboard.close();
    }
}