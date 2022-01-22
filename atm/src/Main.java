import java.io.*;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String username;
        String password;

        int right = 3;

        int balance = 1000; //default
        int operation;
        int deposit;
        int withdraw;

        //reading from file > contentLine - upgradable
        BufferedReader br;

        br = new BufferedReader(new FileReader("C:/Users/chpat/Desktop/java_test_vscode/balance.txt"));

        String contentLine = br.readLine();
        System.out.println(contentLine);


        while (right > 0) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Username: ");
            username = scanner.nextLine();

            System.out.println("Password: ");
            password = scanner.nextLine();

            if (username.equals("ataberk") && password.equals("dev123")) {
                System.out.println("Access granted.");
                System.out.println("-----------------------------------");

                do {
                    System.out.println("Select operation: \n 1- Balance Info \n 2- Deposit \n 3- Withdraw \n 4- Exit");
                    operation = scanner.nextInt();
                    if (operation == 1) {
                        System.out.println(contentLine);
                    } else if (operation == 2) {
                        System.out.println("Enter amount of deposit: ");
                        deposit = scanner.nextInt();
                        balance += deposit;
                        System.out.println(contentLine);
                    } else if (operation == 3) {
                        System.out.println("Enter amount of withdraw: ");
                        withdraw = scanner.nextInt();
                        if (withdraw > balance) {
                            System.out.println("Your balance is not enough.");
                        } else {
                            balance -= withdraw;
                        }
                    }


                } while (operation != 4);
                break;

            } else {
                right--;
                System.out.println("Access denied.");
                if (right == 0) {
                    System.out.println("Blocked.");
                }
            }
        }
        br.close();
    }
}
