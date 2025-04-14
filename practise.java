import java.util.Scanner;
public class practise {
    public static void main(String[] args) {
      /*Scanner sc = new Scanner(System.in);
        System.out.println("              *********  WELCOME TO SBI  ********           ");
        System.out.println("PLEASE ENTER YOUR NAME (only name) ");
        String name  = sc.next();
        System.out.println("ENTER YOUR CONTACT NUMBER ");
         long number = sc.nextLong();
        System.out.println(" ENTER YOUR AGE ");
        System.out.println("Note*- only 18+ is allowed to open this account ");
        int age = sc.nextInt();
      if (age >= 18){
          System.out.println("verified");
      }else{
          System.out.print("not verified");
          System.exit(1);
      }
        System.out.println("enter the 10 digit of your account number");
        long serial = sc.nextLong();
        System.out.println("is that correct\n for corecct 1 or not correct 0");
        int ans = sc.nextInt();
        boolean answere = true;
        if (ans == 0){
            long num = sc.nextLong();
            System.out.println("next");
        }else{
            System.out.println("next");
        }*/
        Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if(a>b||b<a){
          System.out.println(a);
      }else if (b>a||a<b){
          System.out.println(b);
      }else {
          System.out.println(c);
      }


    }
}
