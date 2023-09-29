package exampleSnippet.accessSpecifier.package1;

public class AccessSpecifierClass1 {
    public String publicName = "a";
    private String privateName = "b";
    protected String protectedName = "c";
    String defaultName = "d";
    public void SamePackageSameClass(){
        System.out.println(publicName);
        System.out.println(privateName);
        System.out.println(protectedName);
        System.out.println(defaultName);
    }
}
class SubClass extends AccessSpecifierClass1{
    public void SamePackageSubClass(){
        System.out.println(publicName);
//        System.out.println(privateName);
        System.out.println(protectedName);
        System.out.println(defaultName);
    }
}
class NonSubclass{
    public void SamePackageNonSubClass(){
        AccessSpecifierClass1 obj = new AccessSpecifierClass1();
        System.out.println(obj.publicName);
//        System.out.println(obj.privateName);
        System.out.println(obj.protectedName);
        System.out.println(obj.defaultName);
    }
}
