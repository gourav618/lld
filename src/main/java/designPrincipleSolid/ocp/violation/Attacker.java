package designPrincipleSolid.ocp.violation;

import java.util.List;

public class Attacker {
    /**
     * This class is used to demonstrate the violation of OCP
     * where we have a list of superheros and there attack methods
     * lets say we want to add a new superhero and its attack method
     * will have to modify this enum class and add a new method
     * and also add a case statement here which is a violation of OCP
     * <p>
     * also we don't know what type of superhero we are dealing with that's why we have to use switch case
     *
     * @param superHeroes list of superheros
     */
    public void attackWithSuperHero(List<SuperHero> superHeroes){
        for (int i=0; i<superHeroes.size(); i++){
            SuperHero superHero = superHeroes.get(i);
            switch (superHero) {
                case BAT_MAN:
                    superHero.attackWithBatMan();
                    break;
                case CAPTAIN_AMERICA:
                    superHero.attackWithCaptainAmerica();
                    break;
                case SPIDER_MAN:
                    superHero.attackWithSpiderMan();
                    break;
            }
        }
    }
}
