import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;

        // int toplam = 0; //toplami sifirdan baslatiyorum.
        // int sayac = 0;



        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunu girin: ");
        matematik = scanner.nextInt();
        // if (matematik >= 0 && matematik <= 100) {
        //     toplam += matematik;
        //     sayac++;
        // } else {
        //     System.out.println("0-100 arasinda not girin");
        // }
        int ders1 = (matematik <= 100 && matematik >= 0) ? matematik : 0;

        System.out.println("Fizik notunu girin: ");
        fizik = scanner.nextInt();
        int ders2 = (fizik <= 100 && fizik >= 0) ? fizik : 0;

        System.out.println("Türkçe notunu girin: ");
        turkce = scanner.nextInt();
        int ders3 = (turkce <= 100 && turkce >= 0) ? turkce : 0;

        System.out.println("Kimya notunu girin: ");
        kimya = scanner.nextInt();
        int ders4 = (kimya <= 100 && kimya >= 0) ? kimya : 0;

        System.out.println("Müzik notunu girin: ");
        muzik = scanner.nextInt();
        int ders5 = (muzik <= 100 && muzik >= 0) ? muzik : 0;

        scanner.close();

        int maintoplam = ((ders1 + ders2 + ders3 + ders4 + ders5) / 5);

        if (maintoplam >= 55) {
            System.out.println("Not ortalamaniz: " + maintoplam + " ile gectiniz.");
        }
        else {
            System.out.println("Not ortalamaniz: " + maintoplam + " ile kaldiniz.");
        }
    }
}
