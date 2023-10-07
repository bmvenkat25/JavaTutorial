package exampleSnippet;

public class Inheritance {
}
class A{
    public void method1(){
        System.out.println("Method1 Called");
    }
}
class B extends A{
    public void method2(){
        System.out.println("Method2 Called");
    }
}
class C extends B{
    public void method3(){
        System.out.println("Method3 Called");
    }
    public static void main(String[] args){
        C obj = new C();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
