package viktorvasileski.u5w1d1.entities;

public class Drink extends MenuItem{
    public Drink(){};

    public Drink(String name, int calories, double price){
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", calories=" + calories +
                ", price=" + price;
    }
}
