public class if_else {
    public static void main(String args[]) {
        int a,b,c;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=Integer.parseInt(args[2]);
        if(a>b&&a>c){
            System.out.println(a+"is greatest.");
        }
        else if(a<b&&a>c){
            System.out.println(a+"is middle.");
        }
        else if(a<b&&a<c){
            System.out.println(a+"is lowest.");
        }
        else if(b>a&&b>c){
            System.out.println(b+"is greatest.");
        }
        else if(b>a&&b<c){
            System.out.println(b+"is middle.");
        }
        else if(b<a&&b<c){
            System.out.println(b+"is lowest.");
        }
        else{
            System.out.println(c+"is greatest");
        }

    }
    
}
