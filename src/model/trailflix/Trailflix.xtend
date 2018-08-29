package model.trailflix

import java.util.ArrayList;
import model.user.User;
import model.person.Person;
import model.content.genre.Genre;
import model.content.Content;

class Trailflix {
	var ArrayList<User> users;
	var ArrayList<Person> casts;//el tipo del arreglo despues va a cambiar
	var ArrayList<Genre> genres;
	var ArrayList<Content> content;
	
	new (ArrayList<User> theUsers, ArrayList<Person> theCasts, ArrayList<Genre> theGenres, ArrayList<Content> theContent){
		this.users = theUsers;
		this.casts = theCasts;
		this.genres = theGenres;
		this.content = theContent;
	}
	
	
	/**
	 * 
	 * GET_TERS 
	 * 
	 **/
	 
	 def getUsers(){
	 	return this.users;
	 }
	 
	 def getCasts(){
	 	return this.casts;
	 }
	 
	 def getGenres(){
	 	return this.genres;
	 }
	 
	 def getContent(){
	 	return this.content;
	 }
	 
	 /**
	  * 
	  * SET_TERS
	  * 
	  **/
	  
	  def void setUsers(ArrayList<User> newUsers){
	  	this.users = newUsers;
	  }
	  
	  def void setCasts(ArrayList<Person> newCasts){
	  	this.casts = newCasts;
	  }
	  
	  def void setGenres(ArrayList<Genre> newGenres){
	  	this.genres = newGenres;
	  }
	  
	  def void setContent(ArrayList<Content> newContent){
	  	this.content = newContent;
	  }
	  
	  /**
	   *
	   * T_T
	   *  
	   **/
	   
	   def void addAUser(User newUser){
	   	 this.users.add(newUser);
	   }
	   
	   def void addACastMember(Person newCastMember){
	   	 this.casts.add(newCastMember);
	   }
	   
	   def void addNewGenre(Genre newGenre){
	   	 this.genres.add(newGenre);
	   }
	   
	   def void addNewContent(Content newContent){
	   	 this.content.add(newContent);
	   }
	   
	   /**TODO << find a user, content, genre, castMember y testear >> **/ 
}