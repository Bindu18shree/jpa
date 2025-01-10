package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.RestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RestaurantRunner {

    public static void main(String[] args) {

        RestaurantEntity restaurantEntity = new RestaurantEntity(7,"1522",4.6,"New BEL Road",560032,97683652283L,"Veg and Non-veg");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bindu");

       EntityManager entityManager =  entityManagerFactory.createEntityManager();

       entityManager.getTransaction().begin();
       entityManager.persist(restaurantEntity);
       entityManager.getTransaction().commit();

    }
}
