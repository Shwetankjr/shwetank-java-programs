public class sumarray {
        public static void main(String[] args) {
            int arr1[] = new int[5];
            int arr2[] = new int[10];
            int sumArr[] = new int[5];
            int i;
            
            for (i = 0; i < 5; i++) {
                arr1[i] = Integer.parseInt(args[i]);
                System.out.print(arr1[i]+" " );
            }
            System.out.println();
            for(i=5;i<10;i++){
                arr2[i] = Integer.parseInt(args[i]);
                System.out.print( arr2[i]+" ");
            }
            System.out.println();
                 for(i=0;i<5;i++){
                sumArr[i]=Integer.parseInt(args[i]);
                sumArr[i] = arr1[i] + arr2[i+5];
                System.out.print( sumArr[i]+" ");
                 }
            }
    
}
