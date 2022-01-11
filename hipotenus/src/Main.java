import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //a2 + b2 = c2
        //---------------

        /*//degiskenleri olusturma
        int a, b;
        double c;
        //kullanicidan verileri alma
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Kenar: ");
        a = scanner.nextInt();
        System.out.println("2. Kenar: ");
        b = scanner.nextInt();

        c = Math.sqrt(a*a + b*b); //java'da Math.sqrt karekök almamizi saglar
        System.out.println("Hipotenus: " + c);*/

        //////////////////////////////////////////////////////////////////////////////7

        //Ödev
        //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        //
        //Formül
        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //
        //𝑢 = (a+b+c) / 2
        //
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        int a, b, c;
        double d,u; //abc kenarinin toplam yarisi => u, alan değeri => d
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Kenar: ");
        a = scanner.nextInt();
        System.out.println("2. Kenar: ");
        b = scanner.nextInt();
        System.out.println("3. Kenar: ");
        c = scanner.nextInt();

        u = (a+b+c)/2;
        d = Math.sqrt(u*(u-a)*(u-b)*(u-c)); //ucgen hesap formulu
        System.out.println(d);


    }}
