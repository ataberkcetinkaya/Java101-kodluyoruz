import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double matematik1 = scanner.nextInt();
        double matematik2 = scanner.nextInt();
        double matematik3 = scanner.nextInt();
        double matematikortalama = ((matematik1 + matematik2 + matematik3) / 3);

        System.out.println("matematik notu 1 : " + matematik1);
        System.out.println("matematik notu 2 : " + matematik2);
        System.out.println("matematik notu 3 : " + matematik3);
        System.out.println("matematik ortalama : " + matematikortalama);

        boolean notSonucu = matematikortalama <= 60;

        String sonuc = (notSonucu) ? " kaldi" : " gecti";
        //Koşulumuzdan sonra soru işareti koyarız daha sonra koşul doğru ise;
        // dönecek cevabı yazarız daha sonra : iki nokta üst üste koyarak yanlış ise dönecek cevabı yazarız.
        System.out.println(matematikortalama + sonuc);
    }
}
