package designpatterns.behavioral.chainofresponsiblity;

public class TenDispenser extends Dispense{
    @Override
    public void dispenseMoney(Long currency) {
        Long ten =  currency/10;
        currency = currency%10;
        if (ten>0) {
            System.out.println("Collect " + ten + " from dispenser");
        }
    }
}
