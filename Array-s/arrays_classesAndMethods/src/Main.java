import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4};
        int[] list2 = {5, 6, 7, 8};
        double[] list3 = {1.2, 3.4, 5.6, 8.8, 5.4, 4.3};

        // HelperArray helperArray = new HelperArray();
        // helperArray.print(list);
        // System.out.println();
        // helperArray.print(list2);

        //Yukaridaki gibi newlemek yerine o sinifin icerisine gidip onu static yaparsak burada asagidaki gibi kullanabiliriz.
        //HelperArray.print(list);

        //------JAVA.UTIL.ARRAYS------
        System.out.println(Arrays.toString(list3)); //HelperArray icinde yazdigimizin aynisini yapar (siralar). Ve + olarak override etmemize gerek yok int, double calisir.

        // Arrays.fill(list, 10); //list icindeki tum elemanlari 10 yapacak
        // System.out.println(Arrays.toString(list));

        list = HelperArray.fill(list, 20); //HelperArray icinde yaptigimiz manuel .fill();
        //System.out.println(Arrays.toString(list));

        Arrays.fill(list3, 1, 4, 5.5); //secilen array list icin yine secilen 2 index araligindaki degerleri belirtilen degere donusturur.
        //System.out.println(Arrays.toString(list3));

        int[] list4 = {5, 60, 23, 51, 144, 43, 6, 1, 243};
        Arrays.sort(list4); //kucukten buyuge siralar.
        //System.out.println(Arrays.toString(list4));

        int[] list5 = {5, 3, 21, 41, 124, 2343, 654, 321, 8};
        int[] list6 = {5, 3, 21, 41, 124, 2343, 654, 321, 8};
        //System.out.println(HelperArray.search(list5, 21)); //binarySearch elle yazdigim.
        //Arrays.sort(list5); //binarySearch ile aratmadan once liste siralatilabilir.
        System.out.println(Arrays.binarySearch(list5, 21)); //binarySearch java.util.list

        int[] copyList = Arrays.copyOf(list5, 4); //array kopyalama -hangi listeden copy yapilacagi ve kac index kopyalanacagi (list5.length dersek birebir listeyi kopyalar.)
        //System.out.println(Arrays.toString(copyList));

        int[] copylist2 = Arrays.copyOfRange(list5, 0, 6); //hangi index araliklarinda copy yapilacagi
        System.out.println(Arrays.toString(copylist2));

        //System.out.println(Arrays.equals(list5, list6)); //iki liste birbirine esit mi degil mi?
        System.out.println(HelperArray.equals(list5, list6)); //yukaridakinin aynisinin manuel yaptigim versiyonu
    }
}