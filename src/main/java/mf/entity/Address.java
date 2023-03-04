package mf.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Address {
    private String firstLine;
    private String secondLine;
    private String postalCode;
}
