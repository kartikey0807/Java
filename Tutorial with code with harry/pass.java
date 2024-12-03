import java.util.*;

public class pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks for maths");
        int maths = sc.nextInt();
        System.out.println("enter marks for science");
        int science = sc.nextInt();
        System.out.println("enter marks for english");
        int english = sc.nextInt();
        float avg = (maths +science+english)/3.0f;

        if(avg >= 40 && maths>=33&& science>=33&& english>=33){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }

    }
}
