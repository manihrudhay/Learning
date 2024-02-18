package designpatterns.behavioral.chainofresponsiblity;

public class ATMwithdrawal {
    protected static Dispense fiftyDispenser = new FiftyDispenser();
    protected static Dispense twentyDispenser = new TwentyDispenser();
    protected static Dispense tenDispenser = new TenDispenser();
    protected static Dispense dispense;
    static {
        // construct the chain of the currency dispensers in higher to lower
        // denomination
        fiftyDispenser.setNextDispenser(twentyDispenser);
        twentyDispenser.setNextDispenser(tenDispenser);
        dispense = fiftyDispenser;
    }

    public static void withdraw(Long currency) {
        if (currency != null) {
            dispense.dispenseMoney(currency);
        }
    }
}
