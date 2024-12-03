import java.util.*;

public class practise2 {

    public static int fibo2(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else if(n>2){

            int sum = fibo2(n-1)+fibo2(n-2);
            return sum;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();

        int x= fibo2(n);
        if(x==n){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }        
    }
}
