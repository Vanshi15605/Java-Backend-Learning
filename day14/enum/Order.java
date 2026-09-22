enum OrderStatus{
PLACED,
SHIPPED,
CANCELLED,
DELIVERED
}

public class Order{
    public static void main(String[] args) {
        
        OrderStatus ob=OrderStatus.CANCELLED;
        System.out.println(ob);
    }
}