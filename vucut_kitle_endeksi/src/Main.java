import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double boy;
        int kilo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuz: ");
        boy = scanner.nextDouble();
        System.out.println("Kilonuz: ");
        kilo = scanner.nextInt();

        double hesapla = kilo / (boy * boy);

        System.out.println(hesapla);
    }
}
