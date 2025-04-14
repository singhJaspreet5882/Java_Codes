import java.util.Scanner;
public class array01 {
    public static void main(String[] args) {
        // 1st
        // ARRAYS - COLLECTION OF SIMILAR DATA
        // THERE ARE THREE MAIN WAYS OF ARRAYS

        // 1. DECLARATION
      /*  int [] marks;
        //2. MEMORY ALLOCATION
        marks = new int[10];
        // 2.O INITIALIZATION
        marks[0] = 88;
        marks[1] = 89;
        marks[2] = 87;
        marks[3] = 85;
        marks[7] = 84;
        marks[9] = 80;
       // marks[10] = 48; //(EXPECTED ERROR)
        System.out.println(marks [9]);*/
        // 3. DECLARATION + MEMORY ALLOCATION + INITIALIZATION
        Scanner sc = new Scanner(System.in);
        System.out.println("NOTE :- ENTER YOUR NUMBER ONE LESS THAN YOUR ACTUAL NUMBER");
        System.out.println("PLEASE ENTER YOUR NUMBER ");
        int  [] marks1 = {85,65,32,33,65,88,96,45,69,83,23};
        int  user = sc.nextInt();
        System.out.println(marks1[user]);
        if (marks1[user] > 34){
            System.out.println("GOOD YOU ARE PASS");
        }else{
            System.out.println("FAIL! TRY HARDER");
        }
    }
}
