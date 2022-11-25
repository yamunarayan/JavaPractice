package factory_Pattern;

public class Payment {

    private Card card;

    public Payment(Card card){
        this.card=card;
    }

    public void paymentForBoughtItems(long amount){
        System.out.println("Payment through the debitcard");
    }

    public static void main(String[] args){
        Card debitCard= new DebitCard();
        Card creditCard= new CreditCard();
        Payment payment= new Payment(debitCard);
        payment.paymentForBoughtItems(500);
    }

}
