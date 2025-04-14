public class Test extends Thread{
    @Override
    public void run() {
       try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
           System.out.println(e);
       }
    }

    public static void main(String[] args) throws InterruptedException{
       Test t1 = new Test();
        System.out.println(t1.getState());
       t1.start();
       System.out.println(t1.getState());
       Thread.sleep(1000);
       System.out.println(t1.getState());
       t1.join();

    }
}
