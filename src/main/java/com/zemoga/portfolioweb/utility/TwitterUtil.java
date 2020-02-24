package com.zemoga.portfolioweb.utility;

import java.util.ArrayList;
import java.util.List;

import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

import com.zemoga.portfolioweb.model.TweetCurriculumVitae;

public class TwitterUtil {
	
	public List<TweetCurriculumVitae> getTweetsList() {
		
		TwitterTemplate twitterTemplate = new TwitterTemplate("KRy7l0v8wex3w8Sy5zThai3Ea", 
				"X2eBm0Y21kYEuR74W3Frqc2JVIizOj8Q1EVGatDsEVVEJo0ucu", 
				"1220032047516921859-otvXjhExyUTZ5GLxssc9h5ORqtPZja", 
				"tmJKqM4ORfQW6CH7wIVV8uKNpmSEmeFAP8lYwGb19uYjj");
		
		List<Tweet> tweetsList = twitterTemplate.timelineOperations().getUserTimeline("Peter_Dinklage", 5);
		
		
		List<TweetCurriculumVitae> tweetsListCv = new ArrayList<TweetCurriculumVitae>();
		for(Tweet tweet:tweetsList) {
			TweetCurriculumVitae item = new TweetCurriculumVitae();
			item.setText(tweet.getUnmodifiedText());
			if(tweet.getEntities().hasMentions()) {
				item.setScreenName(tweet.getEntities().getMentions().get(0).getScreenName());
				item.setProfileImageUrl(twitterTemplate.userOperations().getUserProfile(item.getScreenName()).getProfileImageUrl());
			}
			else {
				item.setScreenName(tweet.getFromUser());
				item.setProfileImageUrl(tweet.getProfileImageUrl());
			}
			tweetsListCv.add(item);
		}
		return tweetsListCv;
	}

}
