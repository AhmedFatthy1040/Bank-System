public class Savings extends Account {
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
    public Savings(String name, String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }
    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }
    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
    }
    public void showInfo() {
        super.showInfo();
        System.out.println(" Your Savings Account Features" +
                "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n Safety Deposit Box Ket: " + safetyDepositBoxKey);
    }
}
