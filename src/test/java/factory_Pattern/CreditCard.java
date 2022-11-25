package factory_Pattern;

public class CreditCard implements Card {
    @Override
    public void doPayment() {
        System.out.println("paying through the crdit card");
    }
}
