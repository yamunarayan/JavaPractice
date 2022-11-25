package Dependency_Inversion_principle;

public class DebitCard implements Card{
    @Override
    public void doPayment() {
        System.out.println("paying through the crdit card");

    }
}
