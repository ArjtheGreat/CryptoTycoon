import java.util.Hashtable;

public class Game {
    private Player player;
    private Hashtable<String, Cryptocurrency> cryptocurrencies;
    private boolean gameOver;

    public Game() {
        player = new Player(10000);
        cryptocurrencies = new Hashtable<>();
        gameOver = false;
    }

    public void addCryptocurrency(String name, double price) {
        cryptocurrencies.put(name, new Cryptocurrency(name, price));
    }

    public void updateCryptocurrencyPrice(String name, double newPrice) {
        cryptocurrencies.get(name).setPrice(newPrice);
    }

    // ... implement methods for handling game events and player actions ...

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}
