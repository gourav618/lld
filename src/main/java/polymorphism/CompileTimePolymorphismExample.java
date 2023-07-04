package polymorphism;

public class CompileTimePolymorphismExample {
    public static void main(String[] args){
        printData(1);
        printData('a');
    }

    //overloading  main method
    //by default jvm will call main method with string array as input
    //if we want to call this main method we need to call it explicitly
    public static void main(Integer args){
        System.out.println("Main method with 2 args");
        printData(1);
        printData('a');
    }

    /**
     * Overloading method ==> compile time polymorphism
     * method name is same but input parameter/signature is different
     * if we these method are polymorphic method i.e multiple form one take int input and other take string input
     * @param a
     */
    private static void printData(char a) {
        System.out.println("Print char data: " + a);
    }

    private static void printData(int i) {
        System.out.println("Print int data: " + i);
    }
}
