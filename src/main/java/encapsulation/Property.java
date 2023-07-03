package encapsulation;

public class Property {

    private final double bankBalance;
    private final double investments;

    public Property(double bankBalance, double investments) {
        this.bankBalance = bankBalance;
        this.investments = investments;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public double getInvestments() {
        return investments;
    }
}
