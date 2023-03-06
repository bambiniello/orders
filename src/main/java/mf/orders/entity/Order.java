package mf.orders.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    @Column
    private long id;
    //    @JoinColumn(name="user_id")
    @OneToOne
    private User user;
    @Column
    private int size;
    @Column
    private BigDecimal totalPrice;
    @Column
    private Date orderDate;
    @Column
    private String test;

}
