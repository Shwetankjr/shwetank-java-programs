public class A {

    public static void main(String a[]){

        int x,y,z;
        x=Integer.parseInt(a[0]);
        y=Integer.parseInt(a[1]);
        z=Integer.parseInt(a[2]);
        int k;
        k=(x>y?x:y);
        System.out.println("Middle="+k);
        int s;
        s=(k>z?k:z);
        System.out.println("Greatest="+s);
        
        //System.out.println("x="+x);

    }
    
}
