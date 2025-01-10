package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.Restaurant2Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Restaurant2Runner {

    public static void main(String[] args) {

        Restaurant2Entity restaurant2Entity = new Restaurant2Entity(5, "RNR Biryani", "Belgam", 545602, "Veg and Non-Veg", "Ramya Ravi","contact@rnrbiryani.com",9580902229L);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bindu");

        EntityManager entityManager =  entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(restaurant2Entity);
        entityManager.getTransaction().commit();
    }
}
