import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double product = scanner.nextDouble();

        if  (product >= 1000) {
            double kdvtutari = product * 0.18;
            double kdvlitoplam = kdvtutari + product;
            System.out.println("KDV Tutarı: " + kdvtutari);
            System.out.println("KDV'Li toplam fiyat: " + kdvlitoplam);
        }
        else {
            double kdvtutari = product * 0.08;
            double kdvlitoplam = kdvtutari + product;
            System.out.println("KDV Tutarı: " + kdvtutari);
            System.out.println("KDV'Li toplam fiyat: " + kdvlitoplam);
        }

}}