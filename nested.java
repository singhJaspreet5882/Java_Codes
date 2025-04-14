import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String depart =sc.next();
        switch (empId){
            case 1:
                System.out.println("js");
                switch (depart){
                    case "it":
                        System.out.println("it departmrnt");
                        break;
                    case"cse":
                        System.out.println("cse department");
                        break;
                    default:
                        System.out.println("ivalid");
                }
                break;
            case 2:
                System.out.println("sj");
                switch (depart){
                    case "it":
                        System.out.println("it departmrnt");
                        break;
                    case"cse":
                        System.out.println("cse department");
                        break;
                    default:
                        System.out.println("ivalid");
                }
                break;
            case 3:
                System.out.println("dn");
                switch (depart){
                    case "it":
                        System.out.println("it departmrnt");
                        break;
                    case"cse":
                        System.out.println("cse department");
                        break;
                    default:
                        System.out.println("ivalid");
                }
                break;
            default:
                System.out.println("invalid");
        }
    }
}
