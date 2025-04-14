import java.util.Scanner;

public class vid2switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    //    String fruit = in.next();
//        switch (fruit){
//            case"mango":
//                System.out.println("king of fruits ");
//                break;
//            case"apple":
//                System.out.println("sweet red fruit");
//                break;
//            case"orange":
//                System.out.println("round fruit");
//                break;
//            default:
//                System.out.println("please entered correct fruit");
//
//        }
//        int days = in.nextInt();
//        switch (days){
//            case 1-> System.out.println("heello monday");
//            case 2-> System.out.println("heello tuesday");
//            case 3-> System.out.println("heello wednesday");
//            case 4-> System.out.println("heello thursday");
//            case 5-> System.out.println("heello friday");
//            case 6-> System.out.println("heello saturday");
//            case 7-> System.out.println("heello sunday");
//            default -> System.out.println("invalid response");
//        }
        int empid = in.nextInt();
        switch (empid){
            case 1 -> {
                System.out.println("Jaspreet Singh");
                String details = in.next();
                switch (details) {
                    case "salary" -> System.out.println("Deposit on 1/09/2023");
                    case "mobile" -> System.out.println("6266316532");
                    case "age" -> System.out.println("20");
                    case "DOB" -> System.out.println("09/08/2003");
                    default -> System.out.println("for more details visit www.employee.com ");
            }
            } case 2 -> {
                System.out.println("Gurpreet Singh");
                String details = in.next();
                switch (details) {
                    case "salary" -> System.out.println("Deposit on 1/09/2023");
                    case "mobile" -> System.out.println("9301289693");
                    case "age" -> System.out.println("19");
                    case "DOB" -> System.out.println("03/11/2003");
                    default -> System.out.println("for more details visit www.employee.com ");
            }
            }case 3 -> {
                System.out.println("Sahil Jain");
                String details = in.next();
                switch (details) {
                    case "salary" -> System.out.println("Deposit on 1/09/2023");
                    case "mobile" -> System.out.println("8827693988");
                    case "age" -> System.out.println("20");
                    case "DOB" -> System.out.println("24/04/2003");
                    default -> System.out.println("for more details visit www.employee.com ");
            }
            }
            default -> System.out.println("please enter valid empid");

        }
    }
}
