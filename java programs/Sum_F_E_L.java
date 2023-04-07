public class Sum_F_E_L {
    public static void main(String[] args) {
        int a[]={2,4,3,8,5};
        int greatest=0;
        int sum=0;
        System.out.print("Array=");
        for(int x:a){
            System.out.print(x+" ");
        }
        System.out.println();
         for(int i:a){
               if(i>greatest){
               greatest = i;
            }
        }
        System.out.println("greatest="+greatest);
        for(int j:a){
            sum=sum+j;
        }
        System.out.println("sum="+sum);
    }
}