import java.util.*;
public class calculate {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            int result= n + sum(n-1);
            return result;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result=sum(n);
        System.out.println(result);
    }
    
}
