package com.xworkz.electronics.runner;

import com.xworkz.electronics.entity.SmartWatchesEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class SmartWatchRunner {

    public static void main(String[] args) {

        List<SmartWatchesEntity> watchesEntityList = new ArrayList<>();

        watchesEntityList.add(new SmartWatchesEntity(null,"amaze fit",true, 2799.00, "White"));

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("electronics");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        watchesEntityList.forEach(smartWatchesEntity -> entityManager.persist(smartWatchesEntity));
        entityManager.getTransaction().commit();
    }
}
