
 public class Parent2 {
     int i =10;
    {
        m1();
        System.out.println("first instance block parent");
    }
     public static void main(String [] args){
      Parent2 obj = new Parent2();
        obj.m1();
        System.out.println("main method parent");
     }
     {
        System.out.println("second onstance block parent");
     }
    public  void m1(){
        System.out.println(j);
    }
    static{
        System.out.println("constructor parent");
    }
     int j =20;
}
class child2 extends Parent2{
 int x=30;
{
    m2();
    System.out.println("first instance block child");
}
public static void main(String[] args) {
    child2 obj1= new child2();
    obj1.m2();
    System.out.println("main method child");
}
{
    System.out.println("second instance block");
}
public  void m2(){
    System.out.println(y);
}
child2(){
System.out.println(" child constructor");
}
    int y = 40;
}


