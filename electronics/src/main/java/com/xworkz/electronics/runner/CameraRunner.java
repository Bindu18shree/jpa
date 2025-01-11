package com.xworkz.electronics.runner;

import com.xworkz.electronics.entity.CameraEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class CameraRunner {

    public static void main(String[] args) {

        List<CameraEntity> cameraEntityList = new ArrayList<>();

        cameraEntityList.add(new CameraEntity(null,"Gopro","2019", 31990.00, "Black"));

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("electronics");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        cameraEntityList.forEach(cameraEntity -> entityManager.persist(cameraEntity));
        entityManager.getTransaction().commit();
    }
}
