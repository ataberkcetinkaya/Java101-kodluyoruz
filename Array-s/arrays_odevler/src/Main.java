import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int num = scanner.nextInt();

        int array[] = new int[num];

        System.out.println("Enter the " + num + " numbers now.");

        int k = 1;
        for (int i = 0 ; i < array.length; i++ ) {
            System.out.println(k++ + ". Enter num: " );
            array[i] = scanner.nextInt();
        }

        //notice that now the elements have been stored in the array .. array[]

        System.out.println("These are the numbers you have entered.");
        printArray(array);
        scanner.close();
    }
    //this method prints the elements in an array......
    //if this case is true, then that's enough to prove that the user input has been stored in an array!!!!!!!
    public static void printArray(int arr[]){

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            Arrays.sort(arr);
            System.out.print(arr[i] + " ");
        }
    }
}