import java.util.*;
public class arraysps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[]no={25.0f,27.9f,29.4f,26.3f,22.0f};
        int n = sc.nextInt();
        float sum=0;
        System.out.println(n);
        for(int i =0;i<5;i++){
            sum = sum +no[i];
        }
        System.out.println(sum);

    }
}
