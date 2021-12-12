public interface Outer {
    public void Display();
}
interface Inner extends Outer{
    public void Display1();
}
class Test1 implements Outer, Inner {
    public void Display() {
        System.out.println("Hi");
    }
    public void Display1(){
        System.out.println("Hello");
    }
}
class Test2 {
    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.Display();
        obj.Display1();
    }
    }

