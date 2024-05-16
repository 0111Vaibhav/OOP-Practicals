import java.util.*;

public class P05 {

    /**
     * @param args
     */
    @SuppressWarnings("resource")
    public static void main(String[] args){

        int a,b,c,max=0,mid=0,min=0;
        System.out.println("Enter Numbers :");
        Scanner s = new Scanner(System.in);
        b = s.nextInt();
        a = s.nextInt();
        c = s.nextInt();
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
