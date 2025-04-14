import java.util.Arrays;
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
//     1.   sum();
//     2.  greet();
//     3.   int ans = sum2();
//        System.out.println(ans);
//     4.   String greeting = greet();
//        System.out.println(greeting);
//     5.   int out = result(20, 30);
//        System.out.println(out);

//      6.  String message = greeting("how are you");
//        System.out.println(message);
        // change value-->
//        int[] arr = {1,2,3,4,5};
//        change(arr);
//        System.out.println(Arrays.toString(arr));

        //varargs--
        fun(1,2,3,4,5,6,6,6,6,6,6,6,6,6,6,6);
//    }
        }

    //VARARGS--> variable length arguements;
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }


//    static void change(int[] nums){
//        nums[0]=10;
//    }


    // passing string arguements from the parameters
//  6.  static String greeting(String msg){
//        String name = "Kunal"+ " "+ msg;
//        return name;
//    }

    //passing integers  arguements from the parameters
//   5.  static int result(int a, int b){
//        int sum = a+b;
//        return sum;
//    }

    // returning string value
//   4.  static String greet(){
//        String message  = "how are you ";
//        return message;
//    }

// returning int value
//   3. static int sum2(){
//        int num1 = 10;
//        int num2 = 10;
//        int sum = num1 + num2;
//        return sum;
//
//    }

//   2. static void greet(){
//        System.out.println("Hello World");
//    }
//  1.  static void sum(){
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("Ener number 1:");
//        int num1 = sc.nextInt();
//        System.out.println("Enter number 2:");
//        int num2 = sc.nextInt();
//        int sum = num1 + num2;
//        System.out.println(sum);
//    }
}
