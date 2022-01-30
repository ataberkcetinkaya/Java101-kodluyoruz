public class Main {

    static boolean isPalindrome(String str) {
        int i = 0; //ilk index icin
        int j = str.length() - 1; //son index icin
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) { //ilk ve son indexler esit degilse false
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() -1; i >= 0; i--) { //i-- tersten okuyacak ** i >= 0 kucuk-buyuk operatorune dikkat
            reverse = reverse + str.charAt(i);
        }
        return str.equals(reverse);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome2("kayak"));

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Palindrome kontrolu icin kelime girin: ");
        // String input = scanner.nextLine();
        // System.out.println(isPalindrome2(input));
    }
}
