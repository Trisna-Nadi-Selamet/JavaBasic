package OOP;

abstract class InnerAbstraction_Encapsulation {

    private double amount;

    public InnerAbstraction_Encapsulation(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void pay();

}
