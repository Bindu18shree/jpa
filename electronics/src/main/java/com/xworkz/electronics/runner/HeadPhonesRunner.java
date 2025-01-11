package com.xworkz.electronics.runner;

import com.xworkz.electronics.entity.HeadPhonesEntity;

import javax.jnlp.PersistenceService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class HeadPhonesRunner {

    public static void main(String[] args) {

        List<HeadPhonesEntity> headPhonesEntities = new ArrayList<>();
        headPhonesEntities.add(new HeadPhonesEntity(null,"Boat Nirvana Space","Cosmic Black",1899.00));

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("electronics");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        headPhonesEntities.forEach(headPhonesEntity -> entityManager.persist(headPhonesEntity));
        entityManager.getTransaction().commit();


    }
}
