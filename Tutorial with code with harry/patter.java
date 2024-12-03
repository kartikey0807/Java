import java.util.*;
public class patter {
    static void pattern2(String n,int y){
        for(int i=0;i<y;i++){
            for(int j=0;j<=i;j++){
                System.out.print(n);
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("eneter the patter type");
        String n=sc.nextLine();
        System.out.println("enter the no. of rows");
        int y=sc.nextInt();
        pattern2(n, y);

    }
    
}
