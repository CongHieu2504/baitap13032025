import java.util.Observable;
import java.util.Observer;

public class Investor implements StockObserver {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(this.name + " get received update " + stockName + "changed price to  " + price );
    }
}
