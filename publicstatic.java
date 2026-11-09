package weeklyTaxCalculator;

import java.util.Scanner;

public class publicstatic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double income;
        double taxRate;
        double taxWithholding;

        System.out.println("Weekly Tax Withholding Calculator");

        System.out.print("Enter your weekly income: $");
        income = input.nextDouble();

        if (income < 500) {
            taxRate = 0.10;
        } else if (income < 1500) {
            taxRate = 0.15;
        } else if (income < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        taxWithholding = income * taxRate;

        System.out.printf("\nWeekly Income: $%.2f", income);
        System.out.printf("\nTax Rate: %.0f%%", taxRate * 100);
        System.out.printf("\nWeekly Tax Withholding: $%.2f",
                taxWithholding);

        input.close();
    }
}
