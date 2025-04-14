import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answ = 0;
        while (true){
            System.out.print("ENTER OPR :");
        char ch = sc.next().trim().charAt(0);
        if (ch == '+'|| ch=='-' || ch=='*' || ch=='/'){
            System.out.print("ENTER TWO NUMBERS :");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if( ch == '+'){
                answ = num1+num2 ;
            }
            if( ch == '-'){
                answ = num1-num2 ;
            }
            if( ch == '*'){
                answ = num1*num2 ;
            }
            if( ch == '/'){
                if (num2 != 0) {
                    answ = num1/num2 ;
                }
            }
            else if (ch =='x' && ch=='X') {
                break;
            }
//            else{
//                System.out.println("INVALID RESPONSE");
//            }

            System.out.println(answ);

        }
        }


    }
}