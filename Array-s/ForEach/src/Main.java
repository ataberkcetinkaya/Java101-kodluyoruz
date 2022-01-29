public class Main {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4};

        // for (int i = 0; i < list.length; i++) {
        //   System.out.println(list[i]);
        // }

        for (int i: list) {      //ForEach - yukaridaki for dongusu ile ayni isi gorur.
            System.out.println(i);  //her dongude i listedeki bir elemani cagirir.
        }

        String[] cars = {"BMW", "Mercedes-Benz", "Audi"}; //String ile ForEach

        for (String string : cars) {
            System.out.println(string);
        }

        //multidimensional

        int[][] matris = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };

        // for (int i = 0; i < matris.length; i++) {
        //   for (int k = 0; k < matris[i].length; k++) { // k < matris[i].length = k matrisin i'ninci elemanin boyutu kadar yani o satirin boyutu kadar olacak
        //      System.out.print(matris[i][k] + " ");
        //   }
        //   System.out.println();
        // }

        //ForEach ile yapimi

        for (int[] row : matris) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}