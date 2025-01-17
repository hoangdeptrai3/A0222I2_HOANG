package com.codegym.repository.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.hibernate.cfg.Configuration;
import javax.persistence.EntityManager;

@Repository
public class BaseRepository {
    public static SessionFactory sessionFactory;
    public static EntityManager entityManager;
    static {
        sessionFactory = new Configuration().configure("hibernate.conf.xml").buildSessionFactory();
        entityManager = sessionFactory.createEntityManager();
    }
}
