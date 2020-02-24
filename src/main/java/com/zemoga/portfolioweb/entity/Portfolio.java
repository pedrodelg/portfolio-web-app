package com.zemoga.portfolioweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "portfolio")
public class Portfolio implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idportfolio")
	private int idPortfolio;

	@Column(name = "description")
	private String description;

	@Column(name = "image_url")
	private String imageUrl;

	@Column(name = "twitter_user_name")
	private String twitterUserName;

	@Column(name = "title")
	private String title;

	@Column(name = "id_portfolio")
	private long idPortfolioKey;

	public Portfolio() {

	}

	public Portfolio(int idPortfolio, String description, String imageUrl, String twitterUserName, String title,
			long idPortfolioKey) {
		super();
		this.idPortfolio = idPortfolio;
		this.description = description;
		this.imageUrl = imageUrl;
		this.twitterUserName = twitterUserName;
		this.title = title;
		this.idPortfolioKey = idPortfolioKey;
	}

	public int getIdPortfolio() {
		return idPortfolio;
	}

	public void setIdPortfolio(int idPortfolio) {
		this.idPortfolio = idPortfolio;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getTwitterUserName() {
		return twitterUserName;
	}

	public void setTwitterUserName(String twitterUserName) {
		this.twitterUserName = twitterUserName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getIdPortfolioKey() {
		return idPortfolioKey;
	}

	public void setIdPortfolioKey(long idPortfolioKey) {
		this.idPortfolioKey = idPortfolioKey;
	}

}
