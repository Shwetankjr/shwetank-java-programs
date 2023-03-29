public class UpperClass {
    public static void main(String[] args) {
        String s=args[0],s1=null;
        char ch[]=s.toCharArray();
        for(int i=0;i<=ch.length;i++){
            if((int)ch[i]>=97 && (int)ch[i]<=122){
                ch[i]=(char) ((int)ch[i]-32);
            }
                s1 +=" "+ ch[i];
            }
            System.out.println(s1);
        }
    }

