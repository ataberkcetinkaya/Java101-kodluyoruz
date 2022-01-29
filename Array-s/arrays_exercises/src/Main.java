import java.util.Arrays;

public class Main {

    // dizideki tekrar eden sayilar icin fazladan tekrar edenleri ayirmak icin olan fonksiyonum
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // dizideki elemanlarin ortalamasi
        int[] list = { 12, 32, 33, 44 };

        double sum = 0;

        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i];
        }
        double average = sum / list.length;
        // System.out.println(average);

        // dizideki elemanlarin max ve min degerleri
        int[] list2 = { 43, 132, 13, 1144, -2, -1, -6, 434 }; // min ve max degerleri bulmak icin sifirinci index'ten baslayip diger indextekilerle kiyaslayarak gidicem.

        int min = list[0];
        int max = list[0];

        for (int i : list2) { // forEach ile listeyi geziyorum
            if (i < min) {
                min = i; // i min degerden kucukse yeni min = i olur.
            }
            if (i > max) {
                max = i; // i max degerden buyukse yeni max = i olur.
            }
        }
        // System.out.println(min);
        // System.out.println(max);

        // dizideki tekrar eden sayilar
        int[] list3 = { 3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1 };
        int[] duplicate = new int[list3.length];
        int startIndex = 0;

        for (int i = 0; i < list3.length; i++) {

            for (int j = 0; j < list3.length; j++) {
                if ((i != j) && (list3[i] == list3[j])) { // i, j'ye eşit değilse (ilk index'i kendisiyle karsilastiramayiz) VE listenin i'ninci elemani ile listenin j'ninci elemani esit mi
                    if (!isFind(duplicate, list3[i])) { // isFind() '!' bulunmadiysa, olmadiysa
                        duplicate[startIndex++] = list3[i]; // tekrar edenleri yakalayip yeni array'e postaliyoruz.
                    }
                    break;
                }
            }
        }
        for (int value : duplicate) { // bu forEach'i yapmasaydim, duplicate kismindaki [list3.length]; kadar deger basacagi icin duplicate sayilar haric sifirlari basacakti.
            if (value != 0) { // fakat bu forEach ile sadece sifir olmayan degerleri yani duplicate eden sayilari ekrana bastiriyorum.
                System.out.println(value);
            }
        }
    }
}
