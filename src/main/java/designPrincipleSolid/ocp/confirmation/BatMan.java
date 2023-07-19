package designPrincipleSolid.ocp.confirmation;

/**
 * This is a class which is used to demonstrate the confirmation of OCP
 * where all the superhero's will implement this and have their own attack method,
 *
 */
public class BatMan implements SuperHero{
    @Override
    public void attack() {
        System.out.println("Attacking with Bat Mobile");
    }
}
