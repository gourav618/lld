package encapsulation;

public class Person {

    //all data fields should be private (data hiding) and exposed through getters and setters
    private int age;
    private double weight;
    private char gender;
    private Property property;

    public Person(int age, double weight, char gender, Property property) {
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.property = property;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public char getGender() {
        return gender;
    }

    public Property getProperty() {
        return property;
    }

    /**
     * setters method with restriction logic for all the instance variable
     * which prevents user to input junk data
     *
     * Now we have full control on data by exposing private instance variable by setters with right set of rules
     */

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        }
    }

    public void setProperty(Property property) {
        if (property.getInvestments() > 0 && property.getBankBalance() > 0) {
            this.property = property;
        }
    }
}
//Naked : all variable are public and can be modified/touched by anyone
//direct access of instance variable must be stopped . Data must be hidden i.e Private
//and to expose data we make public getters
