import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int n = sc.nextInt();
        // for(int i=1;i<n;i++){
        //     sum  = sum + (i*n);
        // }     
        // System.out.println(sum);
        int i =0;
        while(i<n-1){
            i++;
            sum  = sum + (i*n);

        }
        System.out.println(sum);
    }
}
