package exampleSnippet.accessSpecifier.package2;

import exampleSnippet.accessSpecifier.package1.AccessSpecifierClass1;

public class SubClass extends AccessSpecifierClass1 {
    public void DifferentPackageSubClass(){
        System.out.println(publicName);
//        System.out.println(privateName);
        System.out.println(protectedName);
//        System.out.println(defaultName);
    }
}
class NonSubClass{
    public void DifferentPackageNonSubClass(){
        AccessSpecifierClass1 obj = new AccessSpecifierClass1();
        System.out.println(obj.publicName);
//        System.out.println(obj.privateName);
//        System.out.println(obj.protectedName);
//        System.out.println(obj.defaultName);
    }
}
