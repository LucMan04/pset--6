package src;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        String cardNum = scan.nextLine();
        StringBuilder productChain = new StringBuilder();
        int product;
        int sum = 0;
        for (int i = cardNum.length() - 2; i >= 0; i -= 2) {
            product = Character.getNumericValue(cardNum.charAt(i)) * 2;
            productChain.append(product);
        }
        for (int j = 0; j < productChain.length(); j++) {
            sum += Character.getNumericValue(productChain.charAt(j));
        }
        if (cardNum.length() % 2 == 0) {
            for (int k = 1; k < cardNum.length(); k += 2) {
                sum += Character.getNumericValue(cardNum.charAt(k));
            }
        } else {
            for (int k = 0; k < cardNum.length(); k += 2) {
                sum += Character.getNumericValue(cardNum.charAt(k));
            }
        }
        if (sum % 10 == 0) {
            if ((cardNum.length() == 13 || cardNum.length() == 16) && cardNum.startsWith("4")) {
                System.out.printf("%nVisa.%n");
            } else if (cardNum.length() == 15 && (cardNum.startsWith("34") || cardNum.startsWith("37"))) {
                System.out.printf("%nAmerican Express.%n");
            } else if (cardNum.length() == 16 && (cardNum.startsWith("51") || cardNum.startsWith("52") || cardNum.startsWith("53") || cardNum.startsWith("54") || cardNum.startsWith("55"))) {
                System.out.printf("%nMastercard.%n");
            } else {
                System.out.printf("%nInvalid.%n");
            }
        } else {
            System.out.printf("%nInvalid.%n");
        }
        scan.close();
    }
}