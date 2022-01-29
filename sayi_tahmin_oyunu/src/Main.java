import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi = (int)(Math.random() * 100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç can istersin?: ");
        int can = scanner.nextInt();
        //System.out.println(sayi);

        int hak = can;
        int sayac = 0;

        while (hak > 0) {
            hak -= 1;
            sayac += 1;

            System.out.println("Tahmin gir: ");
            int tahmin = scanner.nextInt();

            if (tahmin < 0 || tahmin > 99) {
                System.out.println("0-100 arasinda sayi giriniz.");
                continue;
            }
            if (sayi == tahmin) {
                System.out.println("Tebrikler " + sayac + " defada bildiniz. Toplam puaniniz: " + (100 - (100/can) * (sayac -1 )) );
                break;
            } else if ( sayi > tahmin) {
                System.out.println("Yukari");
            } else {
                System.out.println("Asagi");
            }
            if (hak == 0) {
                System.out.println("Hakkiniz bitti. Tutulan sayi: " + sayi);
            }
        }
    }
}