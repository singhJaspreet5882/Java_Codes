import java.util.Scanner;
public class if_else_practise_set {
    public static void main(String[] args) {

        //question 2.
        //System.out.println("PLEASE ENTER YOUR MONTHLY INCOME PER ANNUM ");
        Scanner sc  = new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR MARKS:-");
        System.out.println("1.");
        int marks1 = sc.nextInt();
        System.out.println("2.");
        int marks2 = sc.nextInt();
        System.out.println("3.");
        int marks3 = sc.nextInt();
        int result = (marks1+marks2+marks3);
        double percent = (result/3)*100;
        double percentage = (percent/100);
        System.out.println(percentage);
        System.out.println("%");
        if (percentage >= 33){
            System.out.println("YOU ARE PASS");
        }  else{
            System.out.println("YOU ARE FAIL ");
        }

        // question no.03

        float tax = 0;
        float income = sc.nextFloat();

        if (income < 2.5){
            tax = tax + 0;
        } else if (income > 2.5 && income <= 5) {
            tax = tax + 0.05f * (income - 2.5f);
        }else if (income > 5 && income <= 10){
            tax = tax + 0.05f * (5f - 2.5f );
            tax = tax + 0.2f * (income - 5f);
        } else if (income > 10) {
            tax = tax + 0.05f * (5f - 2.5f);
            tax = tax + 0.2f * (10f - 5f);
            tax = tax + 0.3f * (income - 10f);

        }
        System.out.println("the tax paid by employee is " + tax);

        // question no.04
        System.out.println("ENTER THE NUMBER OF WEEK");
        int week = sc.nextInt();
        switch (week){
            case 1->System.out.println("monday");
            case 2->System.out.println("tuesday");
            case 3->System.out.println("wednesday");
            case 4->System.out.println("thursday");
            case 5->System.out.println("friday");
            case 6->System.out.println("saturday");
            case 7->System.out.println("sunday");
        }

        // question no.06

        String website = sc.next();
        if (website.endsWith(".com")){
            System.out.println("THIS IS A COMMERCIAL WEBSITE");
        }
        else if (website.endsWith(".in")){
            System.out.println("THIS IS AN INDIAN WEBSITE ");
        } else if (website.endsWith(".org")) {
            System.out.println("THIS IS AN ORGANISTAIONAL WEBSITE");
        }

        // CHALLENGE ROCK PAPER SCISSCOR GAME -






    }
}
