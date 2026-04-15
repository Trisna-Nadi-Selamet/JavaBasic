package OOP;

public class EWalletPayment_Inheritance extends InnerAbstraction_Encapsulation {

    public EWalletPayment_Inheritance(double amount) {
        super(amount);

    }

    @Override
    public void pay() {
        System.out.println("Bayar " + getAmount() + " pakai E-walet Card");
    }

}
