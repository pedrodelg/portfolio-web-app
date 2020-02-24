package com.zemoga.portfolioweb.dao;

import com.zemoga.portfolioweb.entity.Portfolio;

public interface PortfolioDAO {

	public Portfolio findPortfolioById(int id);
	
	public void save(Portfolio thePortfolio);
	
}
