import java.util.*;

public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter salary in lakhs");
        float salary = sc.nextFloat();
        
        if(salary<2.5){
            System.out.println("you dont have to pay any tax");
        }
        else if(salary>=2.5&& salary<5.0){
            System.out.println("you have to pay tax ="+salary *(5/100.0f)*100000);
        }
        else if(salary>=5.0&& salary<10.0){
            System.out.println("you have to pay tax ="+salary *(20/100.0f)*100000);
        }
        else if(salary>10.0){
            System.out.println("you have to pay tax ="+salary *(30/100.0f)*100000);
        }
    }
}
