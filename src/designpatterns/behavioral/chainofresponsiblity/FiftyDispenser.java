package designpatterns.behavioral.chainofresponsiblity;

public class FiftyDispenser extends Dispense {

    @Override
    public void dispenseMoney(Long currency) {
        Long fifties =  currency/50;
        currency = currency%50;
        if (fifties>0) {
            System.out.println("Collect " + fifties + " from dispenser");
        }
        this.nextDispenser.dispenseMoney(currency);
    }
}
