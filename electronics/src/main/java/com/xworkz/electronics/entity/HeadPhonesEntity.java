package com.xworkz.electronics.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "headphones_info")
public class HeadPhonesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private String color;
    private Double cost;

}
