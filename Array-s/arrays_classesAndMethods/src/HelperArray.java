public class HelperArray {


    //BU YAZDIGIM HELPER java.util.Arrays ile aynidir. Ayni isleri yaparlar.

    static void print(int[] arr) { //tek boyutlu diziyi ekrana bastiran yardimci fonksiyon - int
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    // void print(double[] arr) { //tek boyutlu diziyi ekrana bastiran yardimci fonksiyon - double - override
    //     System.out.print("[ ");
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.print("]");
    // }


    //JAVA.UTIL.ARRAYS - fill() ile ayni gorevi gorur.

    static int[] fill(int[] arr, int value) { //geriye int array dondurecegi icin static int[]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value; //array'i value'ya esitlesin
        }
        return arr;
    }

    static int search(int[] arr, int value) { //binarysearch metodu/fonksiyonu
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    static boolean equals(int[] arr, int[] arr2) {
        if (arr.length != arr2.length) { //baslangic olarak 2 arrayin length'leri esit degilse zaten kafadan false' idir.
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) { //Herhangi bir elemanlari for ile gezerken esit degilse false donecek.
                return false;
            }
        }
        return true;
    }
}
