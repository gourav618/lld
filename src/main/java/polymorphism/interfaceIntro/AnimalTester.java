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

        System.out.println("========================================");
        Animal a = new Buffalo();
        //type cast Animal object to call graze method
        //since we are only allowed to call methods which are part of Animal interface
        Buffalo b = (Buffalo) a;
        b.graze();

        //what if we want to graze a list of animals
        grazeAll(List.of(new Cat(), new Buffalo(), new Dog(), new Cow()));
        System.out.println("========================================");
        grazeAllGeneric(List.of( new Buffalo(), new Cow()));
    }

    /**
     * Now since we introduced another interface Grazeable which is implemented by Buffalo and Cow class
     * we can have more generic method which abide both the interface contract
     *
     * and let say we add another animal in future which implements Grazeable interface
     * we don't have to change the method
     * @param animals
     */
    private static void grazeAllGeneric(List<Grazeable> animals) {
        for (Grazeable animal : animals) {
            animal.graze();
        }
    }

    /**
     * This is not a generic code since we defy contract of Animal interface
     * by calling graze method which is not part of Animal interface
     *
     * grazes animal which are part of Buffalo and Cow class
     * @param animals
     */
    private static void grazeAll(List<Animal> animals) {
        for (Animal animal : animals) {
            //type cast Animal object to call graze method
            //since we are only allowed to call methods which are part of Animal interface
            if(animal instanceof Buffalo){
                Buffalo b = (Buffalo) animal;
                b.graze();
            } else if (animal instanceof Cow) {
                Cow c = (Cow) animal;
                c.graze();
            }
        }
    }
}
