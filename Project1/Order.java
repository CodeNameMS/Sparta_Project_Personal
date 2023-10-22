package Project1;

public class Order extends Goods{
    public Order(String name, String exp, double price) {
        super(name, exp, price);
    }
    public void Orders(String burger,String exp, double price){
        this.name = burger;
        this.exp = exp;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getExp(){
        return exp;
    }
    public void setExp(String exp){
        this.exp = exp;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
