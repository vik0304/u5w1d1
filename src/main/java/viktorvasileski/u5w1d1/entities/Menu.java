package viktorvasileski.u5w1d1.entities;

import java.util.List;

public class Menu {
    List<Pizzas> menuPizzaList;
    List<Topping> menuToppingList;
    List<Drink> menuDrinkList;

    public Menu(){};

    public Menu(List<Pizzas> menuPizzaList, List<Topping> toppingList, List<Drink> drinkList){
        this.menuPizzaList=menuPizzaList;
        this.menuToppingList=toppingList;
        this.menuDrinkList=drinkList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuPizzaList=" + menuPizzaList +
                ", menuToppingList=" + menuToppingList +
                ", menuDrinkList=" + menuDrinkList +
                '}';
    }
}
