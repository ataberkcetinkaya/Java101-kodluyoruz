import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String username;
        String password;
        String reset;


        String[] users = {"berk", "esra"};
        String[] passwords = {"berk123", "esra123"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your username: ");
        username = scanner.nextLine();
        System.out.println("Your password: ");
        password = scanner.nextLine();


        if (Arrays.asList(users).contains(username) && Arrays.asList(passwords).contains(password)) {
            System.out.println("access granted");
        }
        else if (!Arrays.asList(passwords).contains(password)){
            System.out.println("your pass is incorrect. Please change it...");

            System.out.println("Enter your new pass: ");
            reset = scanner.nextLine();

            scanner.close();

            if (Arrays.asList(passwords).contains(reset)) {
                System.out.println("new password cannot be the same.");
            }
            else {
                System.out.println("password changed.");
            }
        }
        else {
            System.out.println("blocked");
        }
    }
}