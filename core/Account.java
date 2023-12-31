package core;

public abstract class Account implements IBaseRate {
    private String name;
    private String SSN;
    private double balance;
    private static int index = 10000;
    protected String accountNumber;
    protected double rate;
    public Account(String name, String SSN, double initDeposit) {
        this.name = name;
        this.SSN = SSN;
        this.balance = initDeposit;

        index++;
        this.accountNumber = setAccountNumber();

        setRate();
    }
    public abstract void setRate();
    // The account number should has the last two digits of the SSN , 5 unique numbers , and 3 random numbers
    private String setAccountNumber() {
        String lastTwoOfSSN = SSN.substring(SSN.length() - 2);
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }
    public void compound() {
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }
//    Transactions Methods Start
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }
    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }
    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        // Not Complete
        System.out.println("Transferring $" + amount + " to" + toWhere);
        printBalance();
    }
    //    Transactions Methods End
    public void printBalance() {
        System.out.println("Your Balance is Now: " + balance);
    }
    public void showInfo() {
        System.out.println("Name: " + this.name +
                "\ncore.Account Number: " + this.accountNumber +
                "\nBalance: " + this.balance +
                "\nRate: " + this.rate + "%");
    }
}
