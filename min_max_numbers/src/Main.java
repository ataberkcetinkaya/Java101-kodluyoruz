import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi = 0;
        int max = 0;
        int min = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac tane sayi gireceksiniz?: ");

        sayi = scanner.nextInt();

        for (int i = 1; i <= sayi; i++) {
            System.out.println(i + ". sayiyi giriniz: ");
            int x = scanner.nextInt();

            if (x > max) {
                if (min == 0) {
                    min = x;
                }
                max = x;
            }
            if (x < min) {
                if (max == 0) {
                    max = x;
                }
                min = x;
            }
        }
        System.out.println("En Büyük Sayı: " + max);
        System.out.println("En Küçük Sayı: " + min);
    }
}
