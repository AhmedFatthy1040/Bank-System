public class Savings extends Account {
    int safetyDepositBoxID;
    int safetyDepositBoxKey;
    public Savings(String name, String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("Accout Type: Savings Account");
    }
}
