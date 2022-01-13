import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int weather;
        int status;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the weather u think outside?: ");
        weather = scanner.nextInt();
        if (weather <= 5) {
            status = 0;
        } else if (weather <= 15 && weather > 5) {
            status = 1;
        } else if (weather <= 25 && weather > 15) {
            status = 2;
        } else {
            status = 3;
        }
        scanner.close();

        switch (status) {
            case 0:
                System.out.println("Ski time");
                break;
            case 1:
                System.out.println("Cinema");
                break;
            case 2:
                System.out.println("Picnic");
                break;
            case 3:
                System.out.println("Swim");
                break;
            default:
                break;
        }
    }
}
