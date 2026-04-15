package OOP;

public class StatementOopMain {

    public static void main(String[] args) {

        // OOP Menggunakan :
        // - ABSTRACTION + ENCAPSULATION
        // - INHERITANCE
        // - POLYMORPHISM

        InnerAbstraction_Encapsulation py1 = new CreditCardPayment_Inheritance(5000);
        InnerAbstraction_Encapsulation py2 = new EWalletPayment_Inheritance(8000);
        py1.pay();
        py2.pay();
    }

}
