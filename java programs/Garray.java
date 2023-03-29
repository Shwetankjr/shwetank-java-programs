public class Garray {
    public static void main(String[] args) {
        int arr[]=new int[10];
        int greatest=0;
        for(int i=0;i<10;i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        for(int i=1;i<10;i++){
                if(arr[i]>greatest){
                    greatest = arr[i];
                }
        }
        System.out.println("greatest="+greatest);
    }
}
