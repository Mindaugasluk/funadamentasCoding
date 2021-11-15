package example3;

import java.util.Scanner;

public class BankAccount {

    private int balance;
    private int previousTrasaction;
    private String custumerName;
    private String custumerId;
    private Scanner scanner = new Scanner(System.in);

    public BankAccount(String custumerName, String costumerId) {
        this.custumerName = custumerName;
        this.custumerId = costumerId;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            previousTrasaction = amount;
        } else {
            System.out.println("neigiama suma negalimma!");
        }
    }

    public void showPreviousTransaction() {
        if (previousTrasaction > 0) {
            System.out.println("Buvo ivesta: " + previousTrasaction + "euru");
        } else if (previousTrasaction < 0) {
            System.out.println("Buvo isimta: " + previousTrasaction + "euru");
        } else {
            System.out.println("Jokiu operaciju nerasta");
        }
    }

    public void withdrow(int amount) {
        if (balance > amount) {
            balance = balance - amount;
            previousTrasaction = -amount;
        } else {
            System.out.println("Isimti pini negalite.Jus tiek neturite");
        }

    }

    public void showMenu(CreditCard creditCard) {

        boolean isAuthenticated = authenticated(creditCard);

        if (isAuthenticated) {
            char selection = 'X';
            Scanner scanner = new Scanner(System.in);
            printGreetinginfo();


            do {  //daryk sita veiksma
                printMenuSelection();
                selection = scanner.next().charAt(0);
                System.out.println();

                switch (selection) {
                    case 'A':
                        balansas();
                        break;

                    case 'B':
                        depozitas(scanner);
                        break;

                    case 'C':
                        isimtinaSuma(scanner);
                        break;

                    case 'D':
                        paskutinisVeiksmas();
                        break;
                        
                    case 'E':
                        System.out.println("Aciu viso gero");
                        break;
                    
                    default:
                        System.out.println("Neteisingai pasirinkote operacija! Pabandykite dar karta");
                        break;
                }

            } while (selection != 'E');  //kol sita salyga yra teisinga
            System.out.println("Aciu viso gero. Nepamirskite korteles");
        }
    }

    private void balansas() {
        System.out.println("Saskaitos likutis = " + balance);
        System.out.println();
    }

    private void paskutinisVeiksmas() {
        System.out.println("Jusu paskutinis veiksmas");
        showPreviousTransaction();
        System.out.println();
    }

    private void isimtinaSuma(Scanner scanner) {
        System.out.println("Iveskite suma kuria norite isimti: ");
        int amountToWithdraw = scanner.nextInt();
        withdrow(amountToWithdraw);
        System.out.println();
    }

    private void depozitas(Scanner scanner) {
        System.out.println("Iveskite suma kuria norite prideti:");
        int amountToadd = scanner.nextInt();
        deposit(amountToadd);
    }

    private void printMenuSelection() {
        System.out.println("A. Saskaitos likutis");
        System.out.println("B. Prideti pinigu");
        System.out.println("C. Isimti pinigu");
        System.out.println("D. Paskutinis atliktas mokejimas");
        System.out.println("E. Iseitti/EXIT");
        System.out.println("______________________________");
        System.out.println("pasirinkite norima operacija");
        System.out.println("______________________________");
    }

    private void printGreetinginfo() {
        System.out.println("Sveikiname prisijungus");
        System.out.println("Jusu vartotojo ID yra" + custumerId);
        System.out.println("Jusu vartotojo Vardas yra" + custumerName);
        System.out.println();
    }

    private boolean authenticated(CreditCard creditCard) {
        System.out.println("Iveskite PIN");
        Scanner scanner = new Scanner(System.in);
        int pinCode = scanner.nextInt();
        return pinCode == creditCard.getCardPin();
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPreviousTrasaction() {
        return previousTrasaction;
    }

    public void setPreviousTrasaction(int previousTrasaction) {
        this.previousTrasaction = previousTrasaction;
    }

    public String getCustumerName() {
        return custumerName;
    }

    public void setCustumerName(String custumerName) {
        this.custumerName = custumerName;
    }

    public String getCustumerId() {
        return custumerId;
    }

    public void setCustumerId(String custumerId) {
        this.custumerId = custumerId;
    }
}
