package designpatterns.behavioral.chainofresponsiblity;

public abstract class Dispense {
    protected Dispense nextDispenser;
    void setNextDispenser(Dispense nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    public abstract void dispenseMoney(Long currency);

}
