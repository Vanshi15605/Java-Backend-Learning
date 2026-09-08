import java.util.HashSet;
class set2
{

    public static void main(String[] args) {
        
    int[] arr = {10, 20, 10, 30, 20, 40, 30, 50};
       
    HashSet<Integer> dup=new HashSet<>();

    //non duplicate elements

    for(int val:arr)
    {
    
        dup.add(val);
    }
    

    System.out.println("All non duplicates are \n" + dup);


    //duplicate exists or not
    for(int val:arr)
    {
     if(dup.contains(val))
        System.out.println("Duplicate exists");
    else
        dup.add(val);
    }





    HashSet<String> cities = new HashSet<>();
cities.add("Delhi");
cities.add("Mumbai");
cities.add("Noida");
cities.add("Pune");

if(cities.contains("Delhi"))
    System.out.println("delhi presesnt");

}
    

}