import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut Kac Kilo? ");
        int kackiloarmut = scanner.nextInt();
        double armuttoplam = armut * kackiloarmut;

        System.out.println("elma Kac Kilo? ");
        int kackiloelma = scanner.nextInt();
        double elmatoplam = elma * kackiloelma;

        System.out.println("domates Kac Kilo? ");
        int kackilodomates = scanner.nextInt();
        double domatestoplam = domates * kackilodomates;

        System.out.println("muz Kac Kilo? ");
        int kackilomuz = scanner.nextInt();
        double muztoplam = muz * kackilomuz;

        System.out.println("patlican Kac Kilo? ");
        int kackilopatlican = scanner.nextInt();
        double patlicantoplam = patlican * kackilopatlican;

        double geneltoplam = (armuttoplam + elmatoplam + domatestoplam + muztoplam + patlicantoplam);
        System.out.println(geneltoplam);
    }
}
