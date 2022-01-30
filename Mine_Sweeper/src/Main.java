import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, column;
        System.out.println("Mayin Tarlasina Hosgeldiniz !\nLutfen Oynamak Istediginiz Boyutlari Girin: ");
        System.out.println("Satir sayisi boyutu: ");
        row = scanner.nextInt();
        System.out.println("Sutun sayisi boyutu: ");
        column = scanner.nextInt();

        MineSweeper mineSweeper = new MineSweeper(row, column);
        mineSweeper.run();
    }
}