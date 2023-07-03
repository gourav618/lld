package polymorphism.interfaceIntro;

import java.util.List;

public class AnimalUtility {

    /**
     * invoke speak method for list of Animal present in the farm
     * @param animals list of animals
     */
    public static void makeNoise(List<Animal> animals){
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
