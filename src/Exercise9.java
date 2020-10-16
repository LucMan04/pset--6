package src;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height;
        do {
            System.out.print("Height: ");
            height = scan.nextInt();
        } while (height < 1 || height > 24);
        StringBuilder hashtag = new StringBuilder();
        System.out.printf("%n");
        for (int i = 1; i <= height; i++) {
            for (int a = height - i; a > 0; a--) {
                hashtag.append(" ");
            }
            for (int j = i + 1; j > 0; j--) {
                hashtag.append("#");
            }
            hashtag.append("  ");
            for (int k = i + 1; k > 0; k--) {
                hashtag.append("#");
            }
            System.out.printf(hashtag + "%n");
            hashtag.setLength(0);
        }
        scan.close();
    }
}