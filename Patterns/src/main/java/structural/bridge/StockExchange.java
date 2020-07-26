package structural.bridge;

public class StockExchange extends Program{
    protected StockExchange(Developer developer) {
        super(developer);
    }

    public void developProgram() {
        System.out.println("Stock exchange development in progress...");
        developer.writeCode();
    }
}
