package example4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccountServise {

    private static final String MY_DATABASE_LOCATION = "src/main/resources/dateBasic.txt";

    public static List<Account> getAccountsFromDatabase() throws FileNotFoundException {

        FileReader fileReader = new FileReader(MY_DATABASE_LOCATION);
        List<Account> accountList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String singleLine;

            while ((singleLine = bufferedReader.readLine()) != null){
                String[] splitRow = singleLine.split(",");
                Account account = new Account(splitRow[0],splitRow[1],splitRow[3],splitRow[4],splitRow[2]);
                accountList.add(account);
            }

        } catch (IOException a){
            System.out.println("ivyko klaida nuskaitant faila");
        }

        return accountList;
    }
}
