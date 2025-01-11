package com.xworkz.electronics.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "smart_watch_info")
public class SmartWatchesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private Boolean isWaterProof;
    private Double cost;
    private String color;
}
