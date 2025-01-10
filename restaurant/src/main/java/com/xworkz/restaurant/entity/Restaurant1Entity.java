package com.xworkz.restaurant.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "restaurant1")
public class Restaurant1Entity {

    @Id
    @Column(name = "branch")
    private int branch;

    @Column(name = "restaurant_name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "pincode")
    private int pincode;

    @Column(name = "restaurant_type")
    private String restaurantType;

    @Column(name = "owned_by")
    private String ownedBy;

    @Column(name = "contact_mail")
    private String mailId;

    @Column(name = "contact_no")
    private long contactNumber;

    }
