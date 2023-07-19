package designPrincipleSolid.ocp.violation;



import java.util.ArrayList;
import java.util.List;

public class AttackerSimulator {

    public static void main(String[] args){
        Attacker attacker = new Attacker();
        List<SuperHero> superHeroes = new ArrayList<>();
        superHeroes.add(SuperHero.BAT_MAN);
        superHeroes.add(SuperHero.CAPTAIN_AMERICA);
        superHeroes.add(SuperHero.SPIDER_MAN);

        attacker.attackWithSuperHero(superHeroes);
    }
}
