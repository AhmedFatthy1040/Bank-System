public class Checking extends Account {
    int debitCardNumber;
    int debitCardPIN;
    public Checking(String name, String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("Accout Type: Checking Account");
    }
}
