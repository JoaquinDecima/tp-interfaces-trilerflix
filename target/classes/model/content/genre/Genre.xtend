package model.content.genre

class Genre {
	String name
	
	new(String name){
		this.name = name
	}
	
	def getName(){
		this.name
	}
}