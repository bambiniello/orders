package mf.orders.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@Entity
//@Table(name = "adresses")
@Embeddable
public class Address {
//    @Id
//    @Column(name = "address_id")
//    private long id;
    @Column
    private String street;
    @Column
    private String number;
    @Column
    private String postalCode;

//    @OneToOne(mappedBy = "address")
//    private Order order;
}
