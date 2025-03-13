public class Main {
    public static void main(String[] args) {
        Stock SamsungStock = new Stock("Samsung", 500);
        Investor investor1 = new Investor("Huy");
        Investor investor2 = new Investor("Anh");
        Investor investor3 = new Investor("Hieu");

        SamsungStock.addObserver(investor1);
        SamsungStock.addObserver(investor2);
        SamsungStock.addObserver(investor3);

        System.out.println("price changed 1");
        SamsungStock.setPrice(550);

        System.out.println("price changed 2");
        SamsungStock.setPrice(600);


    }
}