package utilities;

import core.*;
import java.sql.*;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;



public class Database {
    private final String url;
    private final String username;
    private final String password;

    public Database(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public List<Account> fetchAccounts() {
        List<Account> accounts = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT * FROM Accounts;";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String ssn = resultSet.getString("ssn");
                    String accountType = resultSet.getString("account_type");
                    double balance = resultSet.getDouble("balance");

                    Account account = createAccount(accountType, name, ssn, balance);
                    accounts.add(account);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return accounts;
    }

    private Account createAccount(String accountType, String name, String ssn, double balance) {
        if ("Checking".equals(accountType)) {
            return new Checking(name, ssn, balance);
        } else if ("Savings".equals(accountType)) {
            return new Savings(name, ssn, balance);
        }
        throw new IllegalArgumentException("Invalid account type: " + accountType);
    }

}
