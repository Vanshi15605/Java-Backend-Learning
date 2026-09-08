import java.util.HashMap;

public class marks {
    public static void main(String[] args) {
        HashMap<String,Integer> marks=new HashMap<>();

        marks.put("Java",100);
        marks.put("DSA",99);
        marks.put("TAFL",79);
        marks.put("MLT",88);
        marks.put("DAA",90);

        System.out.println("Java marks : "+marks.get("Java"));


        if(marks.containsKey("DSA"))
            System.out.println("DSA marks exists");


      System.out.println("BEFOREE REMOVING");
      System.out.println(marks);

      System.out.println("AFTER REMOVING");
      marks.remove("DAA");
      System.out.println(marks);

      System.out.println("SIZE OF MAP " + marks.size());
    }
}
