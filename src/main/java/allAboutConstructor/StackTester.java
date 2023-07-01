package allAboutConstructor;

public class StackTester {
    public static void main(String[] args){
        //calling no args constructor
        Stack s1 = new Stack();

        //calling args constructor
        int[] a = new int[] {4, 1,2};
        Stack s2 = new Stack(a);

        //calling copy constructor
        Stack s3 = new Stack(s2);
    }
}
