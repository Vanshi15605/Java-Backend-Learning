import java.util.ArrayList;
class StudentManager{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Vanshika");
        list.add("Ravi");
        list.add("Priya");
        list.add("Amit");
        list.add("Rahul");

        list.forEach(name -> System.out.println(name));

System.out.println();System.out.println();
        list.removeIf(name -> name.startsWith("R"));

        list.forEach(name -> System.out.println(name));
    }
}