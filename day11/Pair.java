public class Pair<K,V> {

    K key;
    V value;
    Pair(K key,V value)
    {
        this.key=key;
        this.value=value;
    }

    void display()
    {
        System.out.println(key+" "+value);
    }

    public static void main(String[] args) {
        Pair<String,Number> p1=new Pair<String,Number>("EVE", 289);
        p1.display();

        Pair<String,Number> p2=new Pair<String,Number>("EVEAAAAAAAAAAAA", 12289);
        p2.display();
    }
    
}
