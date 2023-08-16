public abstract class Account implements IBaseRate {
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
                "\nAccount Number: " + this.accountNumber +
                "\nBalance: " + this.balance +
                "\nRate: " + this.rate + "%");
    }
}
