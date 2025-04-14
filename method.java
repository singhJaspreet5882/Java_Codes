public class method {
    //static void foo(int a, int b) {
      //  System.out.println("good morning" + a + b);
    static int sum(int x ,int...arr){
        int results = x;
        for (int a: arr){
            results+=a;
        }
        return results;
    }

    public static void main(String[] args) {
        System.out.println("the sum of 1055555 and 2055555:"+ sum(1055555,2055555));
    }
}





