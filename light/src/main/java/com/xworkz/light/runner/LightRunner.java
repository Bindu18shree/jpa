package com.xworkz.light.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LightRunner {

    public static void main(String[] args) {

       EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("light");
       

    }
}
