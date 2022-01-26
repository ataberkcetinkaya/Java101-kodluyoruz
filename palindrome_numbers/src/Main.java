public class Main {

    static boolean isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            System.out.println("===========");
            System.out.println("Sayi => " + temp);

            lastNumber = temp % 10;
            System.out.println("Son basamak => " + lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni sayi => " + reverseNumber);

            temp /= 10; //sondaki basamagini siler
        }

        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println(isPalindrome(101));
    }
}