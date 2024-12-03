import java.util.*;

 class  median{
    public static void main(String [ ]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter values for array");
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int j=0;j<n-1;j++){
            int v=j;
            for(int k=j+1;k<n;k++){
                if(arr[v]>arr[k]){
                   v=k;  
                }
            }
            int temp=arr[v];
            arr[v]=arr[j];
            arr[j]=temp;

        }
        System.out.println("Sorted Array");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("sorting done ");
        if(n%2==0){
            float x=(float)(arr[n/2]+arr[(n/2)-1])/2;
            System.out.println("your ans is:"+x);
        }

        else{
            System.out.println("your ans is:"+arr[n/2]);
        }
        
    }

}
