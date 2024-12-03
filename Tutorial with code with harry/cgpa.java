import java.util.*;

public class cgpa {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter marks of hindi");
        int hindi= sc.nextInt();
        System.out.println("enter marks of maths");
        int maths = sc.nextInt();
        System.out.println("enter marks of english");
        int english=sc.nextInt();

        double cgpa =((double)(maths+hindi+english)/300)*10;
        System.out.println(cgpa);


    }
}
