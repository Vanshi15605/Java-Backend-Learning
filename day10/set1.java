import java.util.HashSet;
class set1{
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40, 30, 50};

        HashSet<Integer> set=new HashSet<>();

        for(int x :arr)
        {
            set.add(x);
        }

        System.out.println(set + "\n \n");

        System.out.println("Size "+set.size());

        System.out.println();

        if(set.contains(40))
        System.out.println("40 is present");
        else
        System.out.println("40 is absent");

        System.out.println();

        if(set.contains(100))
        System.out.println("100 is present");
        else
        System.out.println("100 is absent");


        System.out.println();

        if(set.contains(20))
        {
            set.remove(20);
            System.out.println("20 is deleted");
        }
        else
            System.out.println("20 is not present to remove");


        System.out.println();

        System.out.println(set);
    }
}