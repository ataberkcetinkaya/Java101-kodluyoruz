import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int rowNumber, colNumber, size;
    int[][] map;
    int[][] board;
    boolean start = true;

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber; //kaca kaclik oldugunu bulucam
    }

    public void run() {
        int row, col, success = 0;
        prepareMines();
        print(map);
        System.out.println("Oyun Basladi!");
        while(start) { //start true oldugu surece oyun devam edecek
            print(board);
            System.out.println("Satir: ");
            row = scanner.nextInt();
            System.out.println("Sutun: ");
            col = scanner.nextInt();
            if (row < 0 || row >= rowNumber) { //kullanici yanlis sayilar girerse
                System.out.println("Gecersiz koordinat");
                continue;
            }
            if (col < 0 || col >= colNumber) { //kullanici yanlis sayilar girerse
                System.out.println("Gecersiz koordinat");
                continue;
            }
            if (map[row][col] != -1) { //kullanicinin girdigi deger -1'e esit degilse mayin yoktur
                checkMine(row, col);
                success++;
                if (success == (size - (size / 4))) { //ornegin 25lik bir size arrayde, (eksi) size / 4'une esitse tum cevaplar dogrudur
                    System.out.println("Kazandiniz."); //ve oyun biter.
                    break;
                }
            } else {
                start = false; //else => mayini secerse oyun biter.
                System.out.println("Oyun bitti.");
            }
        }
    }

    public void checkMine(int r, int c) {
        if (map[r][c] == 0) { //baktigim yerlerin 0 olmasi gerek, koselerde -1 ve +1 ile bakarken hata cikmamasi gerek.
            //4'e 4'luk bir alanda 4-4 icin sagina bakma olayini kaldiriyorum (col < colNumber -1) &&
            if ((c < colNumber - 1) && (map[r][c + 1] == -1)) { //Kullanicinin sectigi bolgenin cevresine bakicam.
                board[r][c]++;     //
            } //
            if ((r < rowNumber - 3) && (map[r + 1][c] == -1)) {
                board[r][c]++; //
            } //
            if ((r > 0) && (map[r - 1][c] == -1)) {
                board[r][c]++; //
            } //
            if ((c > 0) && (map[r][c - 1] == -1)) {
                board[r][c]++; //
            }
            if (board[r][c] == 0) {
                board[r][c] = -2;
            }
        }
    }

    public void prepareMines() {
        int randomRow, randomColumn, count = 0;
        while (count != (size / 4)) { //for yerine while ile devam cunku bir mayin -1 ile yerlestiginde tekrar ayni yere mayini KOYMAMAM gerek. for dongusu bunu saymiyor
            randomRow = random.nextInt(rowNumber);
            randomColumn = random.nextInt(colNumber);
            if (map [randomRow] [randomColumn] != -1) { //mayinlari -1 ile belirtiyorum. bir array'de -1 var ise orada mayin vardir.
                map [randomRow] [randomColumn] = -1;
                count++;
            }
        }
    }
    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}