import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //daire alan ve cevresi
        /*int r; //yaricap
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("dairenin yaricapi?: ");
        r = scanner.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("alan: " + alan);
        System.out.println("cevre " + cevre);*/

        //Odev
        double pi = 3.14;
        int r;
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("yaricap girin: ");
        r = scanner.nextInt();
        System.out.println("merkezaci ölcüsü girin: ");
        a = scanner.nextInt();

        double dairealan = (pi * (r*r) * a) /360;
        System.out.println(dairealan);

    }
}
