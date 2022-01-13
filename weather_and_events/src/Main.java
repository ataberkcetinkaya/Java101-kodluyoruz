import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int weather;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the weather u think outside?: ");
        weather = scanner.nextInt();

        if (weather < 5) {
            System.out.println("Ski time in Uludag");
        } else if (weather > 5 && weather < 15) {
            System.out.println("Let's go and watch the new movie");
        } else if (weather > 15 && weather < 25) {
            System.out.println("Picnic outside.");
        } else if (weather > 25 && weather < 40) {
            System.out.println("Pool time");
        } else {
            System.out.println("The weather is: " + weather);
        }
    }
}
