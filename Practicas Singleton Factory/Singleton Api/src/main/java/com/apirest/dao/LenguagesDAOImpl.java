package com.apirest.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.apirest.entity.*;

@Repository
public class LenguagesDAOImpl implements LenguagesDAO {
	 @Autowired
	    private EntityManager entityManager;
	 @Override
	    public List<Lenguages> findAll() {
	        Session currentSession = entityManager.unwrap(Session.class);

	        Query<Lenguages> theQuery = currentSession.createQuery("from Lenguages", Lenguages.class);

	        List<Lenguages> llenguages = theQuery.getResultList();

	        return llenguages;

	    }
	 @Override
	    public Lenguages findById(int id) {
	        Session currentSession = entityManager.unwrap(Session.class);

	        Lenguages llenguages = currentSession.get(Lenguages.class, id);

	        return llenguages;
	    }
	 @Override
	    public void save(Lenguages llenguages) {
	        Session currentSession = entityManager.unwrap(Session.class);

	        currentSession.saveOrUpdate(llenguages);  

	    }
	 @Override
	    public void deleteById(int id) {
	        Session currentSession = entityManager.unwrap(Session.class);

	        Query<Lenguages> theQuery = currentSession.createQuery("delete from Lenguages where id=:lenguagesId");

	        theQuery.setParameter("lenguagesId", id);
	        theQuery.executeUpdate();

	    }
}
