    import java.util.HashMap;
import java.util.Map;
public class level3 {

    public static void main(String[] args) {

        int[] arr = {5, 2, 5, 3, 2, 5, 4, 3};

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }

        // Find maximum frequency
        int maxFreq = 0;
        int mostFrequent = 0;

        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {

            if (e.getValue() > maxFreq) {
                maxFreq = e.getValue();
                mostFrequent = e.getKey();
            }
        }

        System.out.println("Most frequent number: " + mostFrequent);
        System.out.println("Frequency: " + maxFreq);
    }

}
