package sdev;

import java.util.Scanner;

public class Credit_Card_Validation {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number as a long integer: ");
        long cardNumber = input.nextLong();

        if (isValid(cardNumber)) {
            System.out.println(cardNumber + " is valid");
        } else {
            System.out.println(cardNumber + " is invalid");
        }

        input.close();
    }

    public static boolean isValid(long number) {
        int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return (total % 10 == 0);
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String numStr = Long.toString(number);
        for (int i = numStr.length() - 2; i >= 0; i -= 2) {
            int digit = getDigit(Character.getNumericValue(numStr.charAt(i)) * 2);
            sum += digit;
        }
        return sum;
    }

    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            return number % 10 + number / 10;
        }
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String numStr = Long.toString(number);
        for (int i = numStr.length() - 1; i >= 0; i -= 2) {
            sum += Character.getNumericValue(numStr.charAt(i));
        }
        return sum;
    }

    public static boolean prefixMatched(long number, int d) {
        String numStr = Long.toString(number);
        String prefix = Integer.toString(d);
        return numStr.startsWith(prefix);
    }

    public static int getSize(long d) {
        return Long.toString(d).length();
    }

    public static long getPrefix(long number, int k) {
        String numStr = Long.toString(number);
        if (k >= numStr.length()) {
            return number;
        } else {
            return Long.parseLong(numStr.substring(0, k));
        }
    }
}

