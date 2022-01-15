package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        //tek sayilarin toplamini bulacak. (negatif deger girilene kadar)
        do {
            System.out.println("Enter number: ");
            num = scanner.nextInt();
            if (num % 2 == 1) {
                sum += num;
            }
        } while (num > 0);

        System.out.println("Total: " + sum);
    }
}
