package ako.auth.ser.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * Created by weil on 2016/11/12.
 */
@SpringBootApplication
public class Bootstrap {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = SpringApplication.run(Bootstrap.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

}
