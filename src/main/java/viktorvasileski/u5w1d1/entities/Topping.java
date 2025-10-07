package viktorvasileski.u5w1d1.entities;


public class Topping extends MenuItem{
    public Topping(){};

    public Topping(String name, int calories, double price){
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return name + '{' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
