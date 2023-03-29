//import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        int a,b,c,d;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=Integer.parseInt(args[2]);
        d=Integer.parseInt(args[3]);
        int x=Integer.parseInt(args[4]);
        //Scanner sc=new Scanner(System.in);
        System.out.println("main menu");
        System.out.println("press '1' for addition(+)");
        System.out.println("press '2' for multiplication(*)");
        System.out.println("press '3' to find average");
        System.out.println("press '4' to find greatest between them");
        System.out.println("enter your choice:");
        // x=sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("addition="+(a+b+c+d));
                break;
                case 2:
                System.out.println("multiplication="+(a*b*c*d));
                break;
                case 3:
                System.out.println("average="+(a+b+c+d/4));
                break;
                case 4:
                int k;
                k=(a>b?a:b);
                int s;
                s=(k>c?k:c);
                int z;
                z=(s>d?s:d);
                System.out.println("Greatest="+z);
                break;
                
                default:
                System.out.println("wrong choice");
                break;
        }
          
        }



    }
    

