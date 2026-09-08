import java.util.HashSet;

class comarr{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr3 = {3, 4, 5, 6, 7};

    HashSet<Integer> hs=new HashSet<>();
    
    for(int i:arr1)
    {
        hs.add(i);
    }


    for(int i:arr3)
    {
        if(hs.contains(i))
            System.out.println(i);
    }

System.out.println("\n\n\n");


    //elements only aperaing once

    int[] arr = {1, 2, 3, 2, 4, 1, 5};

    HashSet<Integer> single=new HashSet<>();

    for(int i:arr)
    {
        if(!single.contains(i))
            single.add(i);
    }

    System.out.println(single);
    }
}