package model.rating

import model.content.Content

class Rating {
	int stars
	String username
	Content content
	
	new (int stars, String username, Content content){
		this.stars = stars
		this.username = username
		this.content = content
	}
	
	//Getters
	
	def getRatingStars(){
		this.stars
	}
	
	def getRatingUsername(){
		this.username
	}
	
	def getRatingContent(){
		this.content
	}

}
