import java.util.ArrayList;
import java.util.Collections;
class Main
{
public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();


    //problem 1

    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);

System.out.println(list);
System.out.println();

//problem 2

System.out.println(list.get(3));

list.set(1,200);

list.remove(Integer.valueOf(40));

System.out.println(list);
System.out.println();


Collections.sort(list);
System.out.println(list.get(list.size()-1));

}    

}