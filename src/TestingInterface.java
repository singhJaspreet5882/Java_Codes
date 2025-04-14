public interface TestingInterface {
    void run();
}
 class testing{
     public static void main(String[] args) {
         TestingInterface obj = new TestingInterface() {
             @Override
             public void run() {
                 System.out.println("Inside interface");
             }
         };
     }
}
