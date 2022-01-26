import java.util.Scanner;

public class Main {

    static int power() {
        Scanner input = new Scanner(System.in);
        int x, y;
        int result = 1;
        System.out.print("Taban değeri giriniz: ");
        x = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        y = input.nextInt();

        for (int i = 1; i <= y; i++)
            result *= x;

        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sonuç : " + power());
    }
}
