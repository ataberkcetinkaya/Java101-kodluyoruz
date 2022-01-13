package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunu girin: ");
        matematik = scanner.nextInt();

        System.out.println("Fizik notunu girin: ");
        fizik = scanner.nextInt();

        System.out.println("Türkçe notunu girin: ");
        turkce = scanner.nextInt();

        System.out.println("Kimya notunu girin: ");
        kimya = scanner.nextInt();

        System.out.println("Müzik notunu girin: ");
        muzik = scanner.nextInt();

        scanner.close();

        int toplamnot = (matematik + fizik + turkce + kimya + muzik) / 5 ;
        if (toplamnot >= 55) {
            System.out.println("Not ortalamaniz: " + toplamnot + " ile gectiniz.");
        }
        else {
            System.out.println("Not ortalamaniz: " + toplamnot + " ile kaldiniz.");
        }
    }
}
