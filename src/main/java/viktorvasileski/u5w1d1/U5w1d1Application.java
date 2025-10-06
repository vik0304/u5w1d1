package viktorvasileski.u5w1d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import viktorvasileski.u5w1d1.entities.Menu;

@SpringBootApplication
public class U5w1d1Application {

	public static void main(String[] args) {
        SpringApplication.run(U5w1d1Application.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5w1d1Application.class);
        Menu menu = ctx.getBean("Menu", Menu.class);
        System.out.println(menu);
	}

}
