/*public class practisesetmethods {
    static void table(int n){
        for (int i=1;i<=10;i++){
            System.out.format("%d * %d =%d\n",n,i,n*i );
        }
    }
    static void pattern(int n){
        for (int i=0;i<n;i++){
            for (int j=1;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
       // table(7);
        pattern(5);

    }
}
class oopm{
    int a=10; String b = "All the best for your exam";
    void exam(){
        System.out.println(a+" "+ b);
    }
}class execute{
    public static void main(String[] args) {
        oopm r=new oopm();
        r.exam();
    }

}
class rectangle{
    private
    int length;
    int breadth;
    public
    void area(int l, int b){
       length = l;
       breadth = b;
        System.out.println("area of rectangle"+ l*b);
    }
}
class sum{
    public static void main(String[] args) {
        rectangle r=new rectangle();
        r.area(10,15);
    }
}
class A{
    int a,b;
    void another(){
        int a=1100;
        int b=2200;
        System.out.println(a+" "+b);
    }
    A(){
        int a = 10; int b = 20;
        System.out.println(a+" "+b);
    }
    {
        int a = 80; int b = 70;
        System.out.println(a+" "+b);
    }
}class b{
    public static void main(String[] args) {
        A r=new A();
        r.another();

    }
}
class rectangle{
    private int length,breadth;
    public
    Rectangle(int l ,int b){
      l = length;
      b = breadth;
    }
    Rectangle(Rectangle rectangle){
        l = rectangle.l;

    }
}*/
class Rectangle{
    private int length,breadth;
    public Rectangle(){
        System.out.println("constructor called");
        length = 1;
        breadth = 1;
    }
    void show(){
        System.out.println(length);
        System.out.println(breadth);
    }

}
