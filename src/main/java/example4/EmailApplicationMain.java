package example4;

import java.io.FileNotFoundException;
import java.util.List;

public class EmailApplicationMain {

    public static void main(String[] args) throws FileNotFoundException {
        List<Account> accountList = AccountServise.getAccountsFromDatabase();
        Account newEployerAccount = new Account("Mindaugas", "Lukminas");
        System.out.println(newEployerAccount);

        System.out.println();
        System.out.println();
    }
}
