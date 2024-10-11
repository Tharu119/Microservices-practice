package com.codedrake.accounts.entity;


import jakarta.persistence.*;
import lombok.*;
//import jakarta.persistence.Table;

@Entity
@Getter
@Setter
@ToString @AllArgsConstructor @NoArgsConstructor
//@Table(name = "customer")
public class Customer extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private Long customerId;

    private String name;

    private String email;
    @Column(name="mobile_number")
    private  String mobileNumber;


}
