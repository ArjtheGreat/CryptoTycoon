import java.util.Hashtable;

public class Player {
    private double balance;
    private Hashtable<String, Integer> holdings;

    public Player(double balance) {
        this.balance = balance;
        this.holdings = new Hashtable<>();
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        this.balance += amount;
    }

    public Hashtable<String, Integer> getHoldings() {
        return holdings;
    }

    public void addHolding(String currency, int shares) {
        int currentShares = holdings.getOrDefault(currency, 0);
        holdings.put(currency, currentShares + shares);
    }
}
