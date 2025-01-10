package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.RestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindRunner {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bindu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        RestaurantEntity restaurantEntity = entityManager.find(RestaurantEntity.class,3);
        System.out.println(restaurantEntity);
    }
}
