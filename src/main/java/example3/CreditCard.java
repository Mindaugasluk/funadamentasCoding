package example3;

public class CreditCard {


    private int cardPin;
    private String cardHolderName;

    public CreditCard(int cardPin, String cardHolderName) {
        this.cardPin = cardPin;
        this.cardHolderName = cardHolderName;
    }

    public int getCardPin() {
        return cardPin;
    }

    public void setCardPin(int cardPin) {
        this.cardPin = cardPin;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }
}
