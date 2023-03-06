package mf.orders.controller;

import mf.orders.entity.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

//@RequestMapping("/orders")
@RestController
public class OrdersController {


    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/orders")
    public Order getOrders(@RequestParam(value = "name", defaultValue = "World") String name) {
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
//        Order order = new Order(1, 100, 5, null, new BigDecimal("20.50"), null, "wqqqqww");
//        return order;
        return Order.builder().id(counter.incrementAndGet()).test(String.format(template, name)).build();
    }

}
