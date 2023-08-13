public class Savings extends Account {
    int safetyDepositBoxID;
    int safetyDepositBoxKey;
    public Savings(String name, String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
        System.out.println("Account Type is Savings Account");
    }
}
