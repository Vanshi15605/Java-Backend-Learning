import java.util.HashMap;

class hash{
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,1,2,6,7,8,92,3};

        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int ob :ar)
       freq.put(ob,freq.getOrDefault(ob,0)+1);

        System.out.println(freq);
    }
}