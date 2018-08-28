package model.user

import java.util.Date
import java.util.List
import model.content.Content
import java.util.ArrayList

class User {
	var int idCode
	var String username
	var String name
	var Date registerDate
	var Date birthDate
	var List<User> friends
	var List<Content> viewedContent
	var List<Content> favoriteContent
	var List<Content> recommendedContent
	
	new (int idCode, String username, 
		String name, Date registerDate,Date birthDate){
		
		this.idCode = idCode
		this.username = username
		this.name = name
		this.registerDate = registerDate
		this.birthDate = birthDate
		this.friends = new ArrayList<User>
		this.viewedContent = new ArrayList<Content>
		this.favoriteContent = new ArrayList<Content>
		this.recommendedContent = new ArrayList<Content>
		
	}
	
	
	
	
	//Getters
	
	
	def getIdCode(){
		this.idCode
	}
	
	def getUsername(){
		this.username
	}
	
	def getName(){
		this.name
	}
	
	def getRegisterDate(){
		this.registerDate
	}
	
	def getBirthDate(){
		this.birthDate
	}
	
	def getFriends(){
		this.friends
	}
	
	def getViewedContent(){
		this.viewedContent
	}
	
	def getFavoriteContent(){
		this.favoriteContent
	}
	
	def getRecommendedContent(){
		this.recommendedContent
	}
}
