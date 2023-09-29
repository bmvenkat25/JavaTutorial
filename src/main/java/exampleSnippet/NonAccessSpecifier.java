package exampleSnippet;

public class NonAccessSpecifier {
    public static final String STATIC_FINAL = "xyz";
    public static final String STATIC_FINAL_NOINITIALIZATION;
    public final String FINAL = "XYZ";
    public final String FINAL_NOINITIALIZATION;
    static{
        STATIC_FINAL_NOINITIALIZATION = "XYZ";
    }
    NonAccessSpecifier(){
        FINAL_NOINITIALIZATION = "XYZ";
    }
    public static void main(String[] args){

    }
}
