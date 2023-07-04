package polymorphism.interfaceIntro;

public class Cow implements Animal, Grazeable{
    @Override
    public void speak() {
        System.out.println("Moo.... Moo....");
    }

    @Override
    public void move() {
        System.out.println("Cow walking ....");
    }

    @Override
    public void graze() {
        System.out.println("Cow grazing ....");
    }

    /**
     * This method is specific to Cow and not part of Animal interface
     */
//    public void graze(){
//        System.out.println("Cow grazing ....");
//    }
}
