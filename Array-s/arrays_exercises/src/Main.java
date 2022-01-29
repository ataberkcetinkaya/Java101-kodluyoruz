import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //dizideki elemanlarin ortalamasi
        int[] list = {12, 32, 33, 44};

        double sum = 0;

        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i];
        }
        double average = sum / list.length;
        //System.out.println(average);

        //dizideki elemanlarin max ve min degerleri
        int[] list2 = {43, 132, 13, 1144, -2, -1, -6, 434}; //min ve max degerleri bulmak icin sifirinci index'ten baslayip diger indextekilerle kiyaslayarak gidicem.

        int min = list[0];
        int max = list[0];

        for (int i : list2) { //forEach ile listeyi geziyorum
            if (i < min) {
                min = i; //i min degerden kucukse yeni min = i olur.
            }
            if (i > max) {
                max = i; //i max degerden buyukse yeni max = i olur.
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}