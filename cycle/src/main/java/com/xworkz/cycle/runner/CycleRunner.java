package com.xworkz.cycle.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CycleRunner {

    public static void main(String[] args) {

      EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cycle");
    }
}
