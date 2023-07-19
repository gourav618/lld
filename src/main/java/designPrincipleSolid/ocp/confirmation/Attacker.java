package designPrincipleSolid.ocp.confirmation;

import java.util.List;

public class Attacker {
    /**
     * This method is used to demonstrate the confirmation of OCP
     * here since have used the interface SuperHero we can add as many superhero's as we want without modifying this method
     * <p>
     * and since each superhero's implement the interface SuperHero they will have their own attack method,
     * and we don't need to know what type of superhero's we are passing to this method
     * @param superHeroes list of superheros
     */
    public void attackWithSuperHero(List<SuperHero> superHeroes){
        for (SuperHero superHero : superHeroes) {
            superHero.attack();
        }
    }
}
