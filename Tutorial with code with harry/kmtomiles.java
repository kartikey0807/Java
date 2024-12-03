import java.util.*;

public class kmtomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km= sc.nextFloat();
        double conv = 0.621;
        double miles = (km*conv);
        System.out.println("total miles :"+miles);
    }
}
