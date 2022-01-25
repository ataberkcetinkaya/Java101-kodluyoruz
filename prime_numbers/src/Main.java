public class Main {

    public static void main(String[] args) {
        int str =2;
        int end = 100;

        for(int i = str; i < end; i++){
            boolean isPrime = true;
            for (int n = 2; n <= i/2; n++) {
                if (i % n == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                System.out.print(" / " + i);
            }
        }
    }
}
