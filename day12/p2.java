import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Index");
        try{
        int c=sc.nextInt();
        System.out.println(arr[c]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index");
        }

    }
}
