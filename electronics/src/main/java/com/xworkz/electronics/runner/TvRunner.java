package com.xworkz.electronics.runner;

import com.xworkz.electronics.entity.TvEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class TvRunner {

    public static void main(String[] args) {

        List<TvEntity> tvEntityList = new ArrayList<>();

        tvEntityList.add(new TvEntity(null,"Samsung", 42, 54899.90, "Google TV"));

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("electronics");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        tvEntityList.forEach(tvEntity -> entityManager.persist(tvEntity));
        entityManager.getTransaction().commit();

    }
}
