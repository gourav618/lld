package polymorphism.interfaceIntro;

import java.util.List;

public class AnimalUtility {

    /**
     * invoke speak method for list of Animal present in the farm
     * @param animals list of animals
     */
    public static void makeNoise(List<Animal> animals){
        for (Animal animal : animals) {
            //this is runtime polymorphism since we don't know which speak method is invoked, that depends on which
            // animal object is created and passed to this method and that is resolved at run time
            //method invocation depend on polymorphism type i.e animals can take multiple form Ex: cat, dog etc..
            animal.speak();
        }
    }
}
