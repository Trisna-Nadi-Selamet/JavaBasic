package OOP;

public class CreditCardPayment_Inheritance extends InnerAbstraction_Encapsulation {

    public CreditCardPayment_Inheritance(double amount) {
        super(amount);

    }

    // public CreditCardPayment_Inheritance(double amount) {
    // super(amount);
    // }

    @Override
    public void pay() {
        System.out.println("Bayar " + getAmount() + " pakai Credit Card");
    }

}
