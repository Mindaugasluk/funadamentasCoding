package example3;

public class BankMain {

    public static void main(String[] args) {
        CreditCard masterCard = new CreditCard(1234,"Mindaugas Lukminas");
        BankAccount snoras = new BankAccount("Mindaugas","1");
        snoras.showMenu(masterCard);
    }
}
