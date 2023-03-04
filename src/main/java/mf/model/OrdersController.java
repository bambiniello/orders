package mf.model;

import mf.entity.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

    @GetMapping("/orders")
    public Order getOrders() {
        return new Order();
    }
}
