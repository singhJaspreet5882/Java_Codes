package TCS;

public class Recursion {
    public static void print(int n){
        // Base Condition
        if (n == 1) {
            System.out.println(1);
            return;
        }
        // The work you want to do
        System.out.println(n);
        // Recursively calling function again
        print(n-1);
    }
    public static int fibb(int n){
        if (n == 1) {
            System.out.println(0);
            return n;
        }
return n;
    }
    public static void main(String[] args) {
        System.out.println(fibb(5));
    }
}
