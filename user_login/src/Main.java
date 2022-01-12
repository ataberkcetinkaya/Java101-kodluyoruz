import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String username;
        String password;

        String[] users = {"berk", "esra"};
        String[] passwords = {"berk123", "esra123"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your username: ");
        username = scanner.nextLine();
        System.out.println("Your password: ");
        password = scanner.nextLine();
        scanner.close();

        if (Arrays.asList(users).contains(username) && Arrays.asList(passwords).contains(password)) {
            System.out.println("access granted");
        }
        else {
            System.out.println("blocked");
        }
    }
}

