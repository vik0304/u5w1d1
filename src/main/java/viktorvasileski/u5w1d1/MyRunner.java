package viktorvasileski.u5w1d1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import viktorvasileski.u5w1d1.entities.*;

@Component
public class MyRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5w1d1Application.class);
        try {
            Menu m = (Menu) ctx.getBean("menu");
            m.printMenu();

            Table t1 = (Table) ctx.getBean("Tavolo1");

            Order o1 = new Order(4, t1);

            o1.addItem(ctx.getBean("pizza_margherita", Pizzas.class));
            o1.addItem(ctx.getBean("hawaiian_pizza", Pizzas.class));
            o1.addItem(ctx.getBean("salami_pizza", Pizzas.class));
            o1.addItem(ctx.getBean("lemonade", Drink.class));
            o1.addItem(ctx.getBean("lemonade", Drink.class));
            o1.addItem(ctx.getBean("wine", Drink.class));

            System.out.println("DETTAGLI TAVOLO 1:");
            o1.print();

            System.out.println("CONTO TAVOLO 1");
            System.out.println(o1.getTotal());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {
            ctx.close();
        }
    }
}
