package encapsulation;

public class PersonTester {

    public static void main(String[] args){
        Property p = new Property(100.0, 50.0);
        Person person = new Person(20, 60, 'M', p);
        printPerson(person);
    }

    private static void printPerson(Person person) {
        //all variable can be access using dot operator, which should not be the case i.e its public
//        person.age = -9;
//        person.gender= 'Z';
//        person.weight = -5;
//
//        System.out.println("Age: "+ person.age);
//        System.out.println("Weight: "+ person.weight);
//        System.out.println("Gender: "+ person.gender);
//        System.out.println("Property [bankBalance]: "+ person.property.bankBalance);
//        System.out.println("Property [investments]: "+ person.property.investments);

        //so since the instance variable are made private we cannot access using above methods
        //and we need getters for this instance variable to expose data
        System.out.println("Age: "+ person.getAge());
        System.out.println("Weight: "+ person.getWeight());
        System.out.println("Gender: "+ person.getGender());
        System.out.println("Property [bankBalance]: "+ person.getProperty().getBankBalance());
        System.out.println("Property [investments]: "+ person.getProperty().getInvestments());
    }
}
