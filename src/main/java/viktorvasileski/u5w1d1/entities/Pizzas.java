package viktorvasileski.u5w1d1.entities;

import java.util.List;

public class Pizzas extends MenuItem{
    private List<Topping> toppingList;

    public Pizzas(){};

    public Pizzas(String name, int calories, double price, List<Topping> toppingList){
        super(name, calories, price);
        this.toppingList = toppingList;
    }

    @Override
    public String toString() {
        return name +
                " toppings: " + toppingList +
                ", calories=" + calories +
                ", price=" + price ;
    }
}
