package Nihar;
class A{
    int a;
    public void method1(){
        System.out.println("This is a method 1 of class A");
    }
    public void method2(){
        System.out.println("This is a method 2 of class A");
    }
}
class B extends A{
    @Override
    public void method2(){
        System.out.println("This is a method 2 of class B");
    }
    public void method3(){
        System.out.println("This is method 3 of class B");
    }
}
public class P3_4 {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.method1();
        a.method2();
        b.method2();
        b.method3();
        System.out.println("This program is made by 21CE100");
    }

}