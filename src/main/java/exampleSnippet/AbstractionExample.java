package exampleSnippet;

public class AbstractionExample extends Employee{
    void printMethod() {
        System.out.println("Abstraction");
    }
    public static void main(String[] args) {
        AbstractionExample obj = new AbstractionExample();
        obj.printMethod();
    }
}
abstract class Employee{
    abstract void printMethod();
}
