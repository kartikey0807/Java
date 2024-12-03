import java.util.*;
public class present {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no you want to find out");
        int s = sc.nextInt();
        int []arr={25,26,95,85,62};
        for(int i=0;i<5;i++){
            if(s==arr[i]){
                System.out.println("item found");
            }
            
        }
            System.out.println("not found");
            

    }
}
