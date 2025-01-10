package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.RestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateRunner {

    public static void main(String[] args) {

      EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bindu");

      EntityManager entityManager = entityManagerFactory.createEntityManager();
      EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            RestaurantEntity restaurantEntity = entityManager.find(RestaurantEntity.class, 4);

            if (restaurantEntity != null) {
                restaurantEntity.setRestaurantName("Donne Biryani House");
                restaurantEntity.setRestaurantType("Non-veg");
                entityTransaction.begin();
                entityManager.merge(restaurantEntity);
                entityTransaction.commit();
                entityManager.close();
            }

        } catch (Exception e){
            entityTransaction.rollback();
            System.out.println(e.getMessage());
        }
    }
}
