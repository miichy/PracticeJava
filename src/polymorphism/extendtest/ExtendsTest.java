package polymorphism.extendtest;

public class ExtendsTest {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        
        System.out.println("A a1 = new A()--" + a1.show(b));
        System.out.println("A a1 = new A()--" + a1.show(c));
        System.out.println("A a1 = new A()--" + a1.show(d));
        System.out.println("A a2 = new B();--" + a2.show(b));
        System.out.println("A a2 = new B();--" + a2.show(c));
        System.out.println("A a2 = new B();--" + a2.show(d));
        System.out.println("B b = new B();--" + b.show(b));
        System.out.println("B b = new B();--" + b.show(c));
        System.out.println("B b = new B();--" + b.show(d));      
    }
}