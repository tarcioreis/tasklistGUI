package br.com.tasklist.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerGenerator {

    private static final EntityManagerFactory TASKLIST = Persistence.createEntityManagerFactory("tasklist");

    public static EntityManager getEntityManagerTasklist() {
        return TASKLIST.createEntityManager();
    }
}
