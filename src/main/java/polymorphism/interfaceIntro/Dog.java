package polymorphism.interfaceIntro;

public class Dog implements Animal{
    @Override
    public void speak() {
        System.out.println("Woof ....Woof....");
    }

    @Override
    public void move() {
        System.out.println("Dog walking ....");
    }
}
