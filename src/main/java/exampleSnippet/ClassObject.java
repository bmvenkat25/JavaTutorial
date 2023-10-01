package exampleSnippet;

public class ClassObject {
    String Name;
    String Size;

    public ClassObject(String name, String size) {
        Name = name;
        Size = size;
    }

    public ClassObject(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public static void main(String[] args) {
        ClassObject obj = new ClassObject("ABC","S");
        obj.Name="XYZ";
        ClassObject newobj = obj;
        System.out.println(newobj.getName()+" "+newobj.getSize());
//        obj                 -> Object Reference
//        ClassObject()       -> Instance created
//        new ClassObject()   -> Memory Allocated
    }
}
class BM extends ClassObject {
    static {
        System.out.println("Static Called");
    }
    public BM(){
        System.out.println("Constructor called");
    }
    {
        System.out.println("Instance Block called");
    }
    public static void main(String[] args) {
        BM obj = new BM();
    }
}