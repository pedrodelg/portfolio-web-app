package com.zemoga.portfolioweb.controller;

import java.util.List;

import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zemoga.portfolioweb.entity.Portfolio;
import com.zemoga.portfolioweb.model.TweetCurriculumVitae;
import com.zemoga.portfolioweb.service.PortfolioService;
import com.zemoga.portfolioweb.utility.TwitterUtil;

@Controller
@RequestMapping("/portfolio")
public class PortfolioController {

	// create a mapping for "/hello"
	
	private PortfolioService portfolioService;
	
	public PortfolioController(PortfolioService thePortfolioService) {
		portfolioService = thePortfolioService;
	}
	
	@GetMapping("/show")
	public String showPortfolio(Model theModel) {
		
		TwitterUtil tU = new TwitterUtil();				
		List<TweetCurriculumVitae> tweetsListCv = tU.getTweetsList();
		theModel.addAttribute("tweetValue", tweetsListCv);
		
		Portfolio portfolioValue = portfolioService.findPortfolioById(6);
		theModel.addAttribute("portfolioValue", portfolioValue);
		
		return "portfolio-view";
	}
}
