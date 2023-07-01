package allAboutConstructor;

public class Student {

    /**
     * if email is a necessary fields. then we need a constructor with this input
     */
    private String email;
    private char section;
    private  int age;

    public Student(String email) {
        this.email = email;
    }

    /**
     * since other fields are not necessary and user may want to pass any of these to create a object , we would need
     * 2 ^ no instance variable {which are not necessary}
     * as we see below we have 3 extra constructor, to solve this issue we can use builder pattern
     *
     * Another solution is we have all the setters, and then we can create object using default constructor and set the value manually
     * but again if we want to make a particular field mandatory then the object will be in illegal state
     * @param email
     * @param section
     */
    //todo : use builder pattern to optimize so many constructor
    public Student(String email, char section) {
        this.email = email;
        this.section = section;
    }

    public Student(String email, int age) {
        this.email = email;
        this.age = age;
    }

    public Student(String email, char section, int age) {
        this.email = email;
        this.section = section;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public char getSection() {
        return section;
    }

    public int getAge() {
        return age;
    }
}
