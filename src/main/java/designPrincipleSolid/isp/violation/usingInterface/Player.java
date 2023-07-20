package designPrincipleSolid.isp.violation.usingInterface;

/**
 * Single Interface for all players
 * This is a violation of ISP since all players are not required to implement all methods
 * For example, a batsman is not required to implement bowl() method
 */
public interface Player {
    void bat();
    void bowl();
    void field();
    void wicketKeeping();
}
