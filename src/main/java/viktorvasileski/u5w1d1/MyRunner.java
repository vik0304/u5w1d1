package viktorvasileski.u5w1d1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import viktorvasileski.u5w1d1.entities.Menu;
import viktorvasileski.u5w1d1.entities.Order;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private Order order;

    @Autowired
    @Qualifier("Menu")
    private Menu menu;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting application...");
        System.out.println(this.menu);
        System.out.println(this.order);
    }
}
