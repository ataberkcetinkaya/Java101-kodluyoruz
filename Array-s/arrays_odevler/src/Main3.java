import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        //ODEV - MATRIS TRANSPOZUNU BULMA

        Scanner scanner = new Scanner(System.in);
        int i,j;
        int arr[][]=new int[2][3];
        int arr1[][]=new int[3][2];

        for (i = 0; i < 2; i++) {
            for(j=0;j<3;j++)
            {

                System.out.print("["+i+"]"+"["+j+"]"+"=");
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println(" Girilen Matris");
        for (i = 0; i < 2; i++) {
            for( j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++ )
            {
                arr1[j][i]= arr[i][j];
            }
        }
        System.out.println("Matris Transpozu");
        for(i=0;i<3;i++)
        {
            for(j=0;j<2;j++ )
            {
                System.out.print(arr1[i][j]+"  ");
            }
            System.out.println("\n");
        }
    }
}