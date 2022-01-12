import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws Exception {
        int sayi1;
        int sayi2;
        int choose;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. sayiyi girin: ");
        sayi1 = scanner.nextInt();
        System.out.println("2. sayiyi girin: ");
        sayi2 = scanner.nextInt();

        System.out.println("Yapilacak işlemi seçin: \n 1-Toplama \n 2- Çıkarma \n 3- Çarpma \n 4- Bölme");
        choose = scanner.nextInt();
        scanner.close();

        if (choose == 1) {
            System.out.println(sayi1 + sayi2);
        }
        else if (choose == 2) {
            System.out.println(sayi1 - sayi2);
        }
        else if (choose == 3) {
            System.out.println(sayi1 * sayi2);
        }
        else if (choose == 4) {
            System.out.println(sayi1 / sayi2);
        }
    }
}