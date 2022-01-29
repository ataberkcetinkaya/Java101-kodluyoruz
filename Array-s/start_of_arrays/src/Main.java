public class Main {

    // static void printArray(int[] arr) { //int turunde array alacagimizi belirttim.
    //   for (int i = 0; i < arr.length; i++) { //fonksiyon ile array almak...
    //     System.out.println(arr[i]);
    //   }
    // }

    // static void printArray(double[] arr) { //method overloading
    //   for (int i = 0; i < arr.length; i++) { // int yerine double
    //     System.out.println(arr[i]);
    //   }
    // }

    static int[] reverse(int[] list) { //METOTLAR GERIYE ARRAY DONDUREBILIR.
        int[] reverse = new int[list.length];
        for (int i = 0, j = list.length -1; i < list.length; i++, j--) { //j sondan baslayacak
            reverse[i] = list[j];
        }
        return reverse;
    }

    static void printArray(int[] list) { //METOTLAR PARAMETRE OLARAK ARRAY ALABILIR.
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {

        //int[] list = {10, 20, 30, 40, 50}; => default deger olacak sekilde

    /*
    int[] list = new int[10];

    for (int i = 0; i < list.length; i++) {
      list[i] = (i * 10) + 10;
      System.out.println(list[i]);
      */

        //////////////////////////////////////////////////////////////

        double[] list2 = {1.1, 2.0, 3.5};
        int[] list = {10, 20, 30, 40, 50};

        //FOR LOOP - array tek tek gezmek
        // for (int i = 0; i < list.length; i++) {
        //   System.out.println(list[i]);
        // }

        //WHILE LOOP - array tek tek gezmek
        // int i = 0;
        // while (i < list.length) {
        //   System.out.println(list[i]);
        //   i++;
        // }

        //printArray(list2);

        ////////////////////////////////////////////////////////////

        int[] newList = reverse(list);
        printArray(newList); //geriye saydiracak.

    }
}