public class max2 {
    public static void main(String[] args) {
        int [] arr={92,91,82,25,21};
        int max2 =arr[0];
        for(int i=1;i<5;i++){
            if(arr[i]<arr[i-1]){
                max2=arr[i];
            }
            // else{
            //     System.out.println("all no are same ");
            // }
        }
        System.out.println(max2);
    }

}
