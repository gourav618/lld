package allAboutConstructor;

public class Student {

    /**
     * if email is a necessary fields. then we need a constructor with this input
     */
    private String email;
    private char section;
    private  int age;
    private int score;

    public Student(String email) {
        this.email = email;
        //initially its zero;
        this.score = 0;
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
        this(email); //constructor chaining
        this.section = section;
    }

    public Student(String email, int age) {
        this(email);
        this.age = age;
    }

    public Student(String email, char section, int age) {
        this(email, section);
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

    public void printHashCode() {
        System.out.print(this);
        System.out.print(" ");
        //this is how we can pass the current object to other class to do some operation using this keyword
        //same thing happening in above print statement where we pass the instance of this class to print method of PrintStream class
        ScoreCalculator.calculateScore(this);
    }

    public void increaseScore(int score){
        this.score += score;
    }
}
