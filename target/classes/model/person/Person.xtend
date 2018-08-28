package model.person

class Person {
	var String name
	var String profession
	
	new (String name, String profession){
		this.name = name
		this.profession = profession
	}
	
	//Getters
	
	def getPersonName(){
		this.name
	}
	
	def getPersonProfession(){
		this.profession
	}
}
