public abstract class Account implements InterestBaseRate {
    String name;
    String SSN;
    double balance;
    static int index = 10000;
    String accountNumber;
    double rate;
    public Account(String name, String SSN, double initDeposit) {
        this.name = name;
        this.SSN = SSN;
        this.balance = initDeposit;

        index++;
        this.accountNumber = setAccountNumber();
    }
    // The account number should has the last two digits of the SSN , 5 unique numbers , and 3 random numbers
    private String setAccountNumber() {
        String lastTwoOfSSN = SSN.substring(SSN.length() - 2);
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }
    public void showInfo() {
        System.out.println("Name: " + this.name +
                "\nAccount Number: " + this.accountNumber +
                "\nBalance: " + this.balance);
    }
}
