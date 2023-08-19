import core.*;
import utilities.Database;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class BankSystem {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/BankSystem";
        String username = "root";
        String password = "";

        Database database = new Database(url, username, password);
        List<Account> accounts = database.fetchAccounts();

        for (Account account : accounts) {
            account.showInfo();
            System.out.println("------------------------------");
        }
    }

}
