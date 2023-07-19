package designPrincipleSolid.ocp.confirmation;

/**
 * This is a interface which is used to demonstrate the confirmation of OCP
 * where all the superhero's will implement this and have their own attack method,
 * and we can add as many superhero's as we want without modifying this interface
 */
public interface SuperHero {
    void attack();
}
