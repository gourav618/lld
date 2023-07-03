package polymorphism.interfaceIntro;

import java.util.ArrayList;
import java.util.List;

public class AnimalTester {

    public static void main(String[] args){
        //we cannot do this since it's an abstract and cannot be instantiated
        // Animal animal = new Animal();

        Animal animal;
        // object for cat class created
        animal = new Cat();
        animal.move();
        animal.speak();
        //if we note we can change the type to dog from cat object
        animal = new Dog();
        animal.move();
        animal.speak();

        /**
         * above phenomenon where animal is sometime a cat object and then a dog object and invokes same method for that
         * class i.e having multiple forms is called polymorphism
         *
         * To be more specific it's a Runtime Polymorphism , since the forms of object changes in runtime
         * i.e from cat to Dog in runtime
         */

        System.out.println("========================================");
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Dog());
        AnimalUtility.makeNoise(animals);
    }
}
