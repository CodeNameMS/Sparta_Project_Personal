package Project1;
public class Goods extends Menu {
    double price;
    public Goods(String name, String exp, double price) {
        super(name, exp);
        this.price = price;
    }
    public void printing(String name, String exp, double price){
        System.out.printf("%-13s | %2.1f | %s\n", name, price, exp);
    }
}