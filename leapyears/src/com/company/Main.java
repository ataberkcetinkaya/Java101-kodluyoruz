package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter year: ");
        year = scanner.nextInt();

        System.out.println(year);

        if ((year % 4 == 0) && (year % 400 != 0 ) && (year % 100 != 0)) {
            System.out.print(year + " bir artik yildir ! ");

        }else if ((year % 400 == 0) && (year % 100 == 0) && (year % 4 == 0) ) {

            System.out.print(year + " bir artik yildir ! ");

        } else {
            System.out.println(year + " bir artik yil degildir ! ");
        }
    }
}