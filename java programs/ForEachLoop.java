public class ForEachLoop {
    public static void main(String[] args) {
        int a[][]=new int[3][3],k=0;
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                a[i][j]=Integer.parseInt(args[k]);
                k++;
            }
        }
        for(int y:a)
        System.out.println(y);
    }
}