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
@Table(name = "restaurant")
public class RestaurantEntity {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "restaurant_name")
    private String restaurantName;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "location")
    private String location;

    @Column(name = "pincode")
    private Integer pincode;

    @Column(name = "c_no")
    private Long contactNumber;

    @Column(name = "r_type")
    private String restaurantType;


}
