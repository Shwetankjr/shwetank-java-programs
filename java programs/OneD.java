public class OneD{
    public static void main(String[] args) {
        int a[]=new int[5];
        int arr[]={5,3,7,10,20};
        for(int i=0;i<=4;i++){
            System.out.print(arr[i]+" ");
            a[i]=Integer.parseInt(args[i]);
        }
        System.out.println();
        for(int i=0;i<=4;i++){
            System.out.print(a[i]+" ");
        }
    }
}
