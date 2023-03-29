public class ascending {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int t=0;
        System.out.println("Before sorting:");
        for(int i=0;i<=4;i++){
            arr[i]=Integer.parseInt(args[i]);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(arr[i]>arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.print("Sorted Element:");
        for(int i=0;i<5;i++){
        System.out.print(arr[i]+" ");
        }
    }
}
