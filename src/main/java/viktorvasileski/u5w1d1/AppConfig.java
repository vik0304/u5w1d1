package viktorvasileski.u5w1d1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import viktorvasileski.u5w1d1.entities.*;

import java.util.ArrayList;
import java.util.List;

@PropertySource("classpath:application.properties")
@Configuration
public class AppConfig {

    @Bean(name = "Cheese")
    public Topping getCheese(){
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean(name = "Ham")
    public Topping getHam(){
        return new Topping("Ham", 35, 0.69);
    }

    @Bean(name = "Onions")
    public Topping getOnions(){
        return new Topping("Onions", 22, 0.69);
    }

    @Bean(name = "Pineapple")
    public Topping getPineapple(){
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean(name = "Salami")
    public Topping getSalami(){
        return new Topping("Salami", 86, 0.99);
    }

    @Bean(name = "Tomato")
    public Topping getTomato(){
        return new Topping("Tomato", 68, 0.39);
    }

    @Bean(name = "Lemonade")
    public Drink getLemonade(){
        return new Drink("Lemonade (0.33l)", 128, 1.29);
    }

    @Bean(name = "Water")
    public Drink getWater(){
        return new Drink("Water (0.5l)", 0, 1.29);
    }

    @Bean(name = "Wine")
    public Drink getWine(){
        return new Drink("Wine(0.75l, 13%)", 607, 7.49);
    }

    @Bean(name = "Pizza Margherita")
    public Pizzas getMargherita(){
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(getTomato());
        toppingList.add(getCheese());
        return new Pizzas("Pizza Margherita", 1104, 4.99, toppingList);
    }

    @Bean(name = "Hawaiian Pizza")
    public Pizzas getHawaiian(){
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(getTomato());
        toppingList.add(getCheese());
        toppingList.add(getHam());
        toppingList.add(getPineapple());
        return new Pizzas("Hawaiian Pizza", 1024, 6.49, toppingList);
    }

    @Bean(name = "Pizza Salami")
    public Pizzas getSalamiPizza(){
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(getTomato());
        toppingList.add(getCheese());
        toppingList.add(getSalami());
        return new Pizzas("Pizza Margherita", 1160, 5.99, toppingList);
    }

    @Bean(name = "Menu")
    public Menu getMenu(){
        List<Pizzas> pizzasList = new ArrayList<>();
        pizzasList.add(getMargherita());
        pizzasList.add(getHawaiian());
        pizzasList.add(getSalamiPizza());
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(getCheese());
        toppingList.add(getHam());
        toppingList.add(getOnions());
        toppingList.add(getPineapple());
        toppingList.add(getSalami());
        List<Drink> drinkList = new ArrayList<>();
        drinkList.add(getLemonade());
        drinkList.add(getWater());
        drinkList.add(getWine());
        return new Menu(pizzasList, toppingList, drinkList);
    }

    @Bean(name = "Table1")
    public Table getTable1(){
        return new Table(1, 6, false);
    }

    @Bean(name = "Table2")
    public Table getTable2(){
        return new Table(2, 8, false);
    }

    @Bean(name = "Table3")
    public Table getTable3(){
        return new Table(3, 4, true);
    }

}
