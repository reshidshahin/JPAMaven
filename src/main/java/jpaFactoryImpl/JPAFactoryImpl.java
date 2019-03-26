package jpaFactoryImpl;

import jpaFactory.JPAFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAFactoryImpl implements JPAFactory {

    private EntityManager entityManager = null;

    @Override
    public EntityManager getEntityManager() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
        this.entityManager = factory.createEntityManager();
        return entityManager;

    }

    @Override
    public EntityTransaction getEntityTransaction() {

        EntityTransaction transaction = this.entityManager.getTransaction();
        return transaction;

    }
}
