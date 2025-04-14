import java.util.Scanner;

public class vid1loops {
    public static void main(String[] args) {
        // find the nth fibonacci number
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//        while (count <= n){
//            int temp =b;
//            b = b + a;
//             a = temp;
//            count++;
//        }
//        System.out.println(b);
        // count the occurence of 3s
//        int n = 1383939;
//        int count = 0;
//        while(n > 0){
//            int rem = n%10;
//            if (rem==3){
//                count++;
//            }
//                     n = n/10 ;
//        }
//
//        System.out.println(count);
        // reverse the given number
        int n = 123456;
        int ans  = 0;
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            ans = ans*10+rem;
        }
        System.out.println(ans);
    }
}
