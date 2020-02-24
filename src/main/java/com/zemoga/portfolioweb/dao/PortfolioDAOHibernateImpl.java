package com.zemoga.portfolioweb.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zemoga.portfolioweb.entity.Portfolio;

@Repository
public class PortfolioDAOHibernateImpl implements PortfolioDAO {

	private EntityManager entityManager;
	
	@Autowired
	public PortfolioDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public Portfolio findPortfolioById(int id) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Portfolio.class, id);
	}

	@Override
	public void save(Portfolio thePortfolio) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(thePortfolio);
		
	}
	
	

}
