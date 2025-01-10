package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.Restaurant1Entity;
import com.xworkz.restaurant.entity.RestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Restaurant1Runner {

    public static void main(String[] args) {

        Restaurant1Entity restaurant1Entity = new Restaurant1Entity(7, "Paakashala", "Malleshwaram", 560003, "Pure Veg", "KN Vasudeva Adiga","contact@paakashala.com",9580902229L);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bindu");

        EntityManager entityManager =  entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(restaurant1Entity);
        entityManager.getTransaction().commit();
    }
}
