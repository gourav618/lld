package designPrincipleSolid.ocp.violation;

public enum SuperHero {
    /**
     * This is a enum class which is used to demonstrate the violation of OCP
     * where we have a list of superheros and there attack methods
     * lets say we want to add a new superhero and its attack method
     * will have to modify this enum class and add a new method
     * which is a violation of OCP
     * and also if it's used in some other class we will have to modify that class as well
     */
    CAPTAIN_AMERICA,
    BAT_MAN,
    SPIDER_MAN;


    public void attackWithCaptainAmerica(){
        System.out.println("Attacking with Captain America Shield");
    }

    public void attackWithBatMan(){
        System.out.println("Attacking with Bat Mobile");
    }

    public void attackWithSpiderMan(){
        System.out.println("Attacking with Spider Web");
    }
}
