public class Checking extends Account {
    int debitCardNumber;
    int debitCardPIN;
    public Checking(String name, String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
        System.out.println("Account Type is Checking Account");
    }
}
