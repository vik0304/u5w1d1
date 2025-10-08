package viktorvasileski.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@ToString
@AllArgsConstructor
@Component
public class Menu {
    List<Pizzas> menuPizzaList;
    List<Topping> menuToppingList;
    List<Drink> menuDrinkList;

    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
        this.menuPizzaList.forEach(System.out::println);
        System.out.println();

        System.out.println("TOPPINGS");
        this.menuToppingList.forEach(System.out::println);
        System.out.println();

        System.out.println("DRINKS");
        this.menuDrinkList.forEach(System.out::println);
        System.out.println();

    }
}
