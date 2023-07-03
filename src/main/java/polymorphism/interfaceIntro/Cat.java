package polymorphism.interfaceIntro;

public class Cat implements Animal{
    @Override
    public void speak() {
        System.out.println("Mew.... Mew...");
    }

    @Override
    public void move() {
        System.out.println("Cat Walking .. ");
    }
}
