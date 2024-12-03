import java.util.*;

public class table {
    static void pahad(int n){
        for(int i =1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();
        pahad(n);

    }    
}
