public class Checking extends Account {
    int debitCardNumber;
    int debitCardPIN;
    public Checking(String name, String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }
    public void showInfo() {
        super.showInfo();
        System.out.println(" Your Checking Account Features" +
                "\n Debit Card Number: " + debitCardNumber +
                "\n Debit Card PIN: " + debitCardPIN);
    }
    private void setDebitCard() {
        debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
        debitCardPIN = (int)(Math.random() * Math.pow(10, 4));
    }
}
