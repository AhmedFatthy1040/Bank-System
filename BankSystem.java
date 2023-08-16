public class BankSystem {
    public static void main(String[] args) {
        Checking chk1 = new Checking("Ahmed", "65489324", 350);
        Savings svg1 = new Savings("Muhammed", "985214632", 900);

        chk1.showInfo();
        chk1.deposit(500);
        System.out.println("--------------------------");
        svg1.showInfo();
    }
}
