import java.util.*;

public class P5 {

    public static void main(String argss[]){

        int a,b,c,max=0,mid=0,min=0;
        System.out.println("Enter Numbers :");
        Scanner as = new Scanner(System.in);
        a = as.nextInt();
        Scanner bs = new Scanner(System.in);
        b = bs.nextInt();
        Scanner cs = new Scanner(System.in);
        c = cs.nextInt();
        if (a>b &&a>c) {
            max=a;
            if(b>c){
                mid=b;
                min=c;
            }
            else{
                mid=c;
                min=b;
            }
        }
        if (b>a &&b>c) {
            max=b;
            if(a>c){
                mid=a;
                min=c;
            }
            else{
                mid=c;
                min=a;
            }
        }
        if (c>b &&c>a) {
            max=c;
            if(b>a){
                mid=b;
                min=a;
            }
            else{
                mid=a;
                min=b;
            }
        }
        System.out.println("The numbers in decreasing  sequence :" + max + " " + mid + " " + min );
    }

}
