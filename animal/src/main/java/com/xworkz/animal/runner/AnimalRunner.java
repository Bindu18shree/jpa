package com.xworkz.animal.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AnimalRunner {

    public static void main(String[] args) {

      EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("animal");
    }
}
