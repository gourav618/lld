package polymorphism.interfaceIntro;

public interface Grazeable {
    /**
     * This method is specific to Grazeable and not part of Animal interface
     * now we can make our code more generic by using this interface
     */
     void graze();
}
