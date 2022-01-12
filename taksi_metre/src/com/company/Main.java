package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        int baslangic = 10; //acilis ucreti
        int mintutar = 20; //if icinde de kullanilabilir

        double kmbasinatutar = 2.20;

        System.out.println("Gidilecek km?: ");
        int gidilenkm = scanner.nextInt(); //kullanıcıdan km bilgisini aliyorum.

        double toplamtutar = gidilenkm * kmbasinatutar + baslangic ;

        /*if (toplamtutar <= mintutar) {
            System.out.println("Minimum ödenecek tutar kapsamında Borcunuz: 20TL");
        }
        else {
            System.out.println("Borcunuz: " + toplamtutar);*/

        toplamtutar = (toplamtutar < 20) ? 20 : toplamtutar; //20'den küçük ise; ? ile durumun true yada false olmasını bekliyoruz, true ise 20 yap değilse toplam tutari yap
        System.out.println("Toplam borcunuz: " + toplamtutar);


    }
}
