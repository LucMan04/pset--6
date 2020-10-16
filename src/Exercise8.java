package src;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int height;

        do {
            System.out.print("Height: ");
            height = keyboard.nextInt();
        } while (height < 1 || height > 24);

        String formatting = "%" + (height + 1) + "s";
        StringBuilder hashtag = new StringBuilder();
        System.out.printf("%n");

        for (int i = 1; i <= height; i++) {
            for (int j = i + 1; j > 0; j--) {
                hashtag.append("#");
            }
            System.out.printf(String.format(formatting, hashtag) + "%n");
            hashtag.setLength(0);
        }
        keyboard.close();
    }
}