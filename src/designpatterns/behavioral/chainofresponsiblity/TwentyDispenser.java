package designpatterns.behavioral.chainofresponsiblity;

public class TwentyDispenser extends Dispense{
    @Override
    public void dispenseMoney(Long currency) {
        Long twenties =  currency/20;
        currency = currency%20;
        if (twenties>0) {
            System.out.println("Collect " + twenties + " from dispenser");
        }
        this.nextDispenser.dispenseMoney(currency);

    }
}
