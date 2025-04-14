import java.util.Scanner;
public class loops {
    public static void main(String[] args) {

        // loops---->
        // 1. for loop --->
        // q.1 print numbers from 1 to 5;

//        for (int num = 1; num<=5; num+=1){
//            System.out.println( num );
//        }
        // 2. while loop
        // q.2 print numbers from 1 to 5;
//        int num = 1;
//        while (num<=5){
//            System.out.println(num);
//            num++;
//        }
        //3. Do While loop--->
        //q.3 print numbers from 1 to 5;

//        int number = 1;
//        do{
//            System.out.println(number);
//            number++;
//        }while(number<=5);

        // questions on if-else conditions --
        // 1. Find the largest numbers from the user input ;

        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        if (a>b){
//            System.out.println(a);
//        } else if (b>c) {
//            System.out.println(b);
//        } else {
//            System.out.println(c);
//        }

        //2. alphabet case check

//        char ch=  sc.next().trim().charAt(0);
//        if(ch>='a' && ch<='z'){
//            System.out.println("lowercase");
//        }else{
//            System.out.println("uppercase");
//        }

        // 3. fibonacci number
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//        while (count <= n ){
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count ++;
//        }
//        System.out.println(b);


//        int n = 1838939333;
//        int count = 0;
//        while(n  > 0){
//        int  rem = n%10;
//            if(rem == 3){
//                count++;
//            }
//       n =  n/10;
//        }
//        System.out.println(count);
//        int n = 1474785542 ;
//        int n1 = sc.nextInt();
//        int count = 0;
//        while(n>0){
//            int rem = n%10;
//            if(rem == n1){
//                count++;
//            }
//            n = n/10;
//        }
//        System.out.println(count);

//        int n = 626616532;
//        int n1 = sc.nextInt();
//        int cont = 0;
//        while(n>0){
//            int rem = n%10;
//            if(rem == n1){
//                cont++;
//            }
//            n = n/10;
//        }
//        System.out.println(cont);

//        int n1 = 144544454;
//        int n = sc.nextInt();
//        int count = 0;
//        while(n1>0){
//            int rem = n1%10;
//            if(rem==n){
//                count++;
//            }
//            n1=n1/10;
//        }
//        System.out.println(count);

        // fibonaaci series
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 0;
//        while(count < 7){
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count++;
//            System.out.println(b);
//        }

//        int a = 0;
//        int b = 1;
//        for (int i=0; i<10; i++){
//            int temp = b;
//            b = b + a;
//            a = temp;
//            System.out.println(b);
//        }
//        5. reverse the given numbers--->
//         int n = 15478963;
//         int ans = 0;
//         while(n>0){
//             int rem = n%10;
//             n= n/10;
//             ans = ans *10 + rem;
//         }
//        System.out.println(ans);

        int num = 24681012;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            num = num/10;
            sum = sum * 10 + rem;
        }
        System.out.println(sum);


}
}
