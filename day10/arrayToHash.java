import java.util.ArrayList;
import java.util.HashSet;

public class arrayToHash {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(10);
list.add(30);
list.add(20);
list.add(40);
list.add(30);

System.out.println("Before delition of duplicates");
System.out.println(list);

HashSet<Integer> dup=new HashSet<>();

for(int val:list)
{
    dup.add(val);
}


list.clear();

for(int val:dup)
{
    list.add(val);
}

System.out.println("After deletion of duplicates");
System.out.println(list);
    }
}
