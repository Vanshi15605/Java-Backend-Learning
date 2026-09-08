import java.util.HashMap;

public class level2 {
    public static void main(String[] args) {

        //find number of max frequency

        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int ob : arr)
        freq.put(ob,freq.getOrDefault(ob,0)+1);

    }
}
