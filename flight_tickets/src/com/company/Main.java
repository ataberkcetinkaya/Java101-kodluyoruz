package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int km = 0;

        int age = 0;

        int flight_type;

        double onikiyasindirim = 0.5;
        double onikiyirmidortyasindirim = 0.10;
        double altmisbesyasindirim = 0.3;
        double gidisdonusbiletindirim = 0.2;

        double perkm = 0.10;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gidilecek km?: ");
        km = scanner.nextInt();
        if (km < 0) {
            System.out.println("error");
        }

        double total = km * perkm; //girilen nesafe ve normal indirimsiz ucret
        double indirimlitutar = 0;

        System.out.println("Yasiniz: ");
        age = scanner.nextInt();
        if (age > 65) {
            System.out.println(indirimlitutar += (total) - (total * altmisbesyasindirim)); //ok - ok

        } else if (age < 12 && age > 0) {
            System.out.println(indirimlitutar += (total) - (total * onikiyasindirim) * (int) 1); //ok - ok

        } else if ( age >= 12 && age <= 24) {
            System.out.println(indirimlitutar += (total) - (total * onikiyirmidortyasindirim)); //ok - ok

        } else if ( age > 0) {
            System.out.println(indirimlitutar += (total)); //ok - ok

        } else if ( age < 0) {
            System.out.println("error");
        } else {
            System.out.println("error");
        }

        System.out.println("Ucus tipi (1 => Tek Yön , 2 => Gidis Donus): ");
        flight_type = scanner.nextInt();

        if (flight_type == 1 && age > 65) { //tek bilet 20 üzerinden 0.30 indirim ile 6; yani 20-6=14
            System.out.println((total * altmisbesyasindirim) * (int) 0.5 + indirimlitutar + " Tek yön gidis bilet 65+ yas");

        }  else if  (flight_type == 1 && age < 12 && age > 0) {
            System.out.println((total * onikiyasindirim) * (int) 0.5 + indirimlitutar + " Tek yön gidis bilet 0-12 yas");
        } else if (flight_type == 1 && age >= 12 && age <= 24) {
            System.out.println((total * onikiyasindirim) * (int) 0.5 + indirimlitutar + " Tek yön gidis bilet 12-24 yas");
        } else if (flight_type == 1) {
            System.out.println(total);
        }
        //GIDIS-DONUS
        else if (flight_type == 2 && age >= 12 && age <= 24) { //12-24 yas - indirimli fiyat üzerinden yani burada 18 üzerinden 3,6 * 2 gidis dönüs oldugu icin ve toplam indirim tutari 7.2 + 18 = 25.2
            System.out.println((indirimlitutar * gidisdonusbiletindirim) * (int) 3 + indirimlitutar +" Toplam 12-24 yas ve gidis donus indirimli fiyat");

        } else if (flight_type == 2 && age > 65) { //65 yas
            System.out.println((indirimlitutar * gidisdonusbiletindirim) * (int) 3 + indirimlitutar +" Toplam 65 yas ve gidis donus indirimli fiyat");

        } else if (flight_type == 2 && age < 12 && age > 0) { //0-12 yas
            System.out.println((indirimlitutar * gidisdonusbiletindirim) * (int) 3 + indirimlitutar +" Toplam 12 yas alti ve gidis donus indirimli fiyat");

        } else if (flight_type == 2) { //normal
            System.out.println((indirimlitutar * gidisdonusbiletindirim) * (int) 2 + indirimlitutar +" Normal yolcu ve gidis donus indirimli fiyat");
        } else {
            System.out.println("Hatali veri girdiniz");
        }
    }
}
