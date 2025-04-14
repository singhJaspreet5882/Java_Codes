import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit){
            case "mango":
                System.out.println("king hai bhaiya yeh");
                break;
            case "Apple":
                System.out.println("Meetha hai yeh");
                break;
            case "banana":
                System.out.println("mooh me lele");
                break;
            case "grapes":
                System.out.println("ANgoor ki beti");
                break;
            case "pine apple":
                System.out.println("khattaaa");
                break;
            default:
                System.out.println("Invalid response");
                break;

        }
    }
}
