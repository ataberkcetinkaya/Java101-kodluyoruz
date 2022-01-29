import java.util.Arrays;
import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {

        //ODEV - DIZIDEKI ELEMANLARIN FREKANSI

        int[] anArray = {10, 20, 40, 40, 10, 40, 20, 6, 4, 5, 4, 20};

        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int i : anArray) {
            if (!counter.containsKey(i)) {
                counter.put(i, 1);
            } else {
                counter.put(i, counter.get(i) + 1);
            }
        }

        for (int i: counter.keySet()) {
            System.out.println(i + " is repeated by " + counter.get(i) + " times.");
        }
    }
}