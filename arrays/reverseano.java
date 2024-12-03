import java.util.*;

public class reverseano {
    public static int reverseNumber(int num){
        int res=0;
        while(num>0){
            int y= num%10;
            res=res*10+y;
            num=num/10;
        }
        return res;
    }

    public static int getLengthOfNum(int x){
        int length=0;
        while (x>0){
            x=x/10;
            length +=1;
        }
        return length;
    }
    public static int isPalindrome(int x){
        if(reverseNumber(x)==x){
            return 1;

        }
        return 0;
        
    }
    public static void main(String []args ){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(reverseNumber(x));
        System.out.println(isPalindrome(x));

    }
}
