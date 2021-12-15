package com.pluralsight.conferencedemo.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pluralsight.conferencedemo.models.Session;

@Repository
public class SessionRepository {
    @PersistenceContext
    private EntityManager entityManager;
    
    @Autowired
    private SessionJpaRepository jpaRepository;

    public Session create(Session session) {
    	return jpaRepository.saveAndFlush(session);
    }

    public Session update(Session session) {
    	return jpaRepository.saveAndFlush(session);
    }

    public void delete(Long id) {
        jpaRepository.deleteById(id);
    }

    public Session find(Long id) {
        return jpaRepository.getOne(id);
    }

    public List<Session> list() {
        return jpaRepository.findAll();
    }

    public List<Session> getSessionsThatHaveName(String name) {
        return jpaRepository.findBySessionNameContains(name);
    }
}
