package factory_Pattern;

public class DebitCard implements Card {
    @Override
    public void doPayment() {
        System.out.println("paying through the crdit card");

    }
}
