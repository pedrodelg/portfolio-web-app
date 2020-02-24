package com.zemoga.portfolioweb.service;

import com.zemoga.portfolioweb.entity.Portfolio;

public interface PortfolioService {

	public Portfolio findPortfolioById(int id);
	
	public void save(Portfolio portfolio); 
}
