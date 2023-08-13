public abstract class Account implements InterestBaseRate {
    String name;
    String SSN;
    double balance;
    String accountNumber;
    double rate;
    public Account(String name, String SSN, double initDeposit) {
        this.name = name;
        this.SSN = SSN;
        this.balance = initDeposit;
        System.out.println("Name: " + this.name + " SSN: " + this.SSN + " Balance: $" + this.balance);
    }
}
