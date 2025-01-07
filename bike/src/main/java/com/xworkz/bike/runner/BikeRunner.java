package com.xworkz.bike.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BikeRunner {

    public static void main(String[] args) {

      EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bike");
    }
}
