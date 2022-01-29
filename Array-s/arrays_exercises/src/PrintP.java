public class PrintP {
    public static void main(String[] args) {
        String[][] letter = new String[6][3]; //P icin 6'ya 3

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 2) {
                    letter[i][j] = " * ";
                }
                else if (j == 0 || (j == 2 && i == 1)) { //P harfi icin sutunda sifir olanlar ve sutunda 2 olup 1 olan bolum
                    letter[i][j] = " * ";
                }
                else {
                    letter[i][j] = "   ";
                }
            }
        }
        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }}