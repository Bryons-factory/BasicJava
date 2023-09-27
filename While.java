package Lab1;

import java.util.Scanner;

public class IntegersCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, num5;
        int sum, product, max, min;
        double average;

        System.out.print("Enter integer #1: ");
        num1 = input.nextInt();

        System.out.print("Enter integer #2: ");
        num2 = input.nextInt();

        System.out.print("Enter integer #3: ");
        num3 = input.nextInt();

        System.out.print("Enter integer #4: ");
        num4 = input.nextInt();

        System.out.print("Enter integer #5: ");
        num5 = input.nextInt();

        sum = num1 + num2 + num3 + num4 + num5;
        product = num1 * num2 * num3 * num4 * num5;
        average = (double) sum / 5;

        max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }
        if (num5 > max) {
            max = num5;
        }

        min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num4 < min) {
            min = num4;
        }
        if (num5 < min) {
            min = num5;
        }

        System.out.println("Total: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
    }}
