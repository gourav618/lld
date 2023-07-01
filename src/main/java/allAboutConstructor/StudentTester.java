package allAboutConstructor;

public class StudentTester {
    public static void main(String[] args){
        Student s1 = new Student("abc@yaho.com", 'A', 19);
        Student s2 = new Student("abc@yaho.com", 'A', 19);
        //to represent that this keyword refer to the object we have called for
        System.out.println(s1+ " "+s2);
        s1.printHashCode();
        s2.printHashCode();
    }
}
