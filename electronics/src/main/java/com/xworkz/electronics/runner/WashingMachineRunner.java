package com.xworkz.electronics.runner;

import com.xworkz.electronics.entity.WashingMachineEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WashingMachineRunner {

    public static void main(String[] args) {

        List<WashingMachineEntity> washingMachineEntityList = Arrays.asList(
                new WashingMachineEntity(null,"Samsung",7.0,22678.80,"Black" ),
                new WashingMachineEntity(null,"Godrej",5.0,13990.00,"White" ),
                new WashingMachineEntity(null,"Croma",6.5,7750.980,"White" ));

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("electronics");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        washingMachineEntityList.forEach(washingMachineEntity -> entityManager.persist(washingMachineEntity));
        entityManager.getTransaction().commit();
    }
}
