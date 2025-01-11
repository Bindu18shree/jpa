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
@Table(name = "tv_info")
public class TvEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private Integer displaySizeInInches;
    private Double cost;
    private String os;

}
