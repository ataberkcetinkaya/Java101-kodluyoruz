public class PrintA {
    public static void main(String[] args) {
        String[][] letter = new String[6][4];

        for (int i = 0; i < letter.length; i++) { //cok boyutlu dizilerde dizinin length'i satir sayisini verir.
            for (int j = 0; j < letter[i].length; j++) { //sutunlari geziyorum
                if (i == 0 || i == 2) { //yaptigim yapi ile satirda 0 veya 2 olan bolumlerde * olacak.
                    letter[i][j] = " * ";
                }
                else if (j == 0 || j == 3) { //yaptigim yapi ile sutunda 0 veya 3 olan bolumlerde * olacak.
                    letter[i][j] = " * ";
                }
                else { //harici yerler bos kalacak
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