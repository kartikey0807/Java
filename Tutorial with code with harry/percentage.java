import java.util.*;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks for maths ");
        int maths = sc.nextInt();
        
        System.out.println("enter marks for science");
        int science = sc.nextInt();
        
        System.out.println("enter marks for english");
        int english = sc.nextInt();
        
        System.out.println("enter marks for hindi");
        int hindi = sc.nextInt();
        
        System.out.println("enter marks for social");
        int social  = sc.nextInt();
        
        float percentage  = (social+hindi+maths+science+english)/5;
        System.out.println(percentage );
    }
    
}
