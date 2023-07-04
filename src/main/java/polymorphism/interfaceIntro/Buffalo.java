package polymorphism.interfaceIntro;

public class Buffalo implements Animal, Grazeable{
    @Override
    public void speak() {
        System.out.println("Buffalo speaking ....");
    }

    @Override
    public void move() {
        System.out.println("Buffalo walking ....");
    }

    @Override
    public void graze() {
        System.out.println("Buffalo grazing ....");
    }


    /**
     * This method is specific to Buffalo and not part of Animal interface
     */
//    public void graze(){
//        System.out.println("Buffalo grazing ....");
//    }
}
