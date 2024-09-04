package com.wvsdev.demo.config;

import com.wvsdev.demo.domain.entities.Category;
import com.wvsdev.demo.domain.entities.Order;
import com.wvsdev.demo.domain.entities.enums.OrderStatus;
import com.wvsdev.demo.repositories.CategoryRepository;
import com.wvsdev.demo.repositories.OrderRepository;
import com.wvsdev.demo.repositories.UserRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.wvsdev.demo.domain.entities.User;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        Order o1 = new Order(null, OrderStatus.PAID, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, OrderStatus.WAITING_PAYMENT, Instant.parse("2019-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, OrderStatus.WAITING_PAYMENT, Instant.parse("2019-07-22T15:21:22Z"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
