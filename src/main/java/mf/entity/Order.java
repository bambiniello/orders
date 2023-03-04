package mf.entity;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Order {

    private long id;
    private long userId;
    private int size;
    private Address address;
    private BigDecimal totalPrice;
    private Date date;

}
