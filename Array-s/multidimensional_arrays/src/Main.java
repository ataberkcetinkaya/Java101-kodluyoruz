public class Main {
    public static void main(String[] args) {

        int[][] matris = new int[6][6];

        matris[0][0] = 0;
        matris[2][3] = 839;

        int[][] matris2= { //default degerler ile
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0},
        };
        //System.out.println(matris2[3][4]);

        int[][] siralimatris = new int[3][4];
        //System.out.println(siralimatris.length); //satir icin length
        //System.out.println(siralimatris[0].length); //sutun icin length

        int number = 1;
        for (int i = 0; i < siralimatris.length; i++) {
            //siralimatris[i]
            //siralimatris[0][1]
            for (int j = 0; j < siralimatris[i].length; j++) {
                siralimatris[i][j] = number++;
            }
        }

        for (int i = 0; i < siralimatris.length; i++) {
            for (int j = 0; j < siralimatris[i].length; j++) {
                System.out.println(siralimatris[i][j] + " ");
            }
            System.out.println();
        }

    }
}