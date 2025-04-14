
public class faltu {
    class rectangle{
        private int length,breadth;
        public void area(int l, int b){
            length = l;
            breadth = b;
        } void sum( int s){
            System.out.print("Print the sum of rectangle:"+s);
            s = length*breadth;
        } public  void main(String[] args) {
            rectangle r1= new rectangle();
            r1.area (10,20);
            r1.sum(10);
        }



    }
}
