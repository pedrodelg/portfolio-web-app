package com.zemoga.portfolioweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zemoga.portfolioweb.dao.PortfolioDAO;
import com.zemoga.portfolioweb.entity.Portfolio;

@Service
public class PortfolioServiceImpl implements PortfolioService {

	private PortfolioDAO portfolioDAO;

	@Autowired
	public PortfolioServiceImpl(PortfolioDAO thePortfolioDAO) {
		portfolioDAO = thePortfolioDAO;
	}

	@Override
	@Transactional
	public Portfolio findPortfolioById(int id) {

		return portfolioDAO.findPortfolioById(id);
	}

	@Override
	@Transactional
	public void save(Portfolio portfolio) {

		portfolioDAO.save(portfolio);
	}

}
