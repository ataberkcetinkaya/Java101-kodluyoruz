package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number: ");
        num = scanner.nextInt();

        double sum  =0,
                count = 0;

        for (int i = 1; i <= num ; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum = sum + i;
                count++;
            }}

        double average = sum / count;

        if(count==0){
            System.out.println("3 e ve 12 ye bölünen sayilarin ortalamasi:0 ");
        }
        else {
            System.out.println("3 e ve 4 e bölünen sayilarin ortalamasi: " + average);
        }
    }
}
