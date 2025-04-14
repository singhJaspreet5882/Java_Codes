import java.util.Scanner;

public class vid1 {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//        if(a>b){
//            System.out.println(a);
//        } else if (b>c) {
//            System.out.println(b);
//        }else{
//            System.out.println(c);
//        }
//        int max = a;
//        if(b > max) {
//            max = b;
//        } if (c > max) {
//            max = c;
//        }
//        System.out.println(max);
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
