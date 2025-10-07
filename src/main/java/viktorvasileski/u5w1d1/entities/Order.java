package viktorvasileski.u5w1d1.entities;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order {
    private int orderNum;
    private Pizzas pizza1;
    private Pizzas pizza2;
    private Pizzas pizza3;
    private Pizzas pizza4;
    private double total;
    private double coverCharge;

    public Order(@Qualifier("Pizza Margherita") Pizzas pizza1, @Qualifier("Pizza Margherita") Pizzas pizza2, @Qualifier("Pizza Salami") Pizzas pizza3, @Qualifier("Hawaiian Pizza") Pizzas pizza4, @Value("${table.charge}") double coverCharge){
        this.pizza1=pizza1;
        this.pizza2=pizza2;
        this.pizza3=pizza3;
        this.pizza4=pizza4;
        this.coverCharge=coverCharge;
        this.total=pizza1.getPrice()+pizza2.getPrice()+pizza3.getPrice()+pizza4.getPrice()+(4*coverCharge);
    }

    @Override
    public String toString() {
        return "Order: \n" +
                "Number=" + orderNum +
                ", \n" + pizza1 + pizza2 + pizza3 + pizza4 +
                ", \n total=" + total;
    }
}
