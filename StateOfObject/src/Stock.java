import java.util.ArrayList;
import java.util.List;

public class Stock{

    private String name;
    private double price;
    private List<StockObserver> stockObservers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }


    public List<StockObserver> getStockObservers() {
        return stockObservers;
    }

    public void setStockObservers(List<StockObserver> stockObservers) {
        this.stockObservers = stockObservers;
    }

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
        this.stockObservers = new ArrayList<StockObserver>();
    }

    public void addObserver(StockObserver observer) {
        stockObservers.add(observer);
    }
    public void removeObserver(StockObserver observer) {
        stockObservers.remove(observer);
    }
    public void setPrice(double newPrice){
        if(price != newPrice){
            price = newPrice;
            notifyObserver();
        }
    }
    private void notifyObserver(){
        for(StockObserver observer : stockObservers){
            observer.update(this.name, this.price);
        }
    }

}
