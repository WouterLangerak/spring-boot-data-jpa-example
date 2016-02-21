package nl.wjl.template.springbootjpa.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Wouter on 18-2-2016.
 */
@EnableJpaRepositories("nl.wjl.template.springbootjpa.*")
@EntityScan("nl.wjl.template.springbootjpa.*")
@ComponentScan("nl.wjl.template.springbootjpa.*")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
