package model.trailflix

import java.util.ArrayList;
import model.user.User;
import model.person.Person;
import model.content.genre.Genre;
import model.content.Content;
import model.content.movie.Movie
import java.util.List
import model.content.series.Series

class Trailflix {
	var ArrayList<User> users;
	var ArrayList<Person> casts;//el tipo del arreglo despues va a cambiar
	var ArrayList<Genre> genres;
	var ArrayList<Content> content;

	new(){}
	
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
	   
	   def List<Movie> getAllMovies(){
	   	this.content.filter(typeof(Movie)).toList()
	   }
	   
	   def List<Series> getAllSeries(){
	   	this.content.filter(typeof(Series)).toList()
	   }
	   
	   def List<User> getAllUsers(){
	   	this.users
	   }
	   
	   def float getMovieRating(Movie m){
	   	 1.1f //f de float , hay que ponerlo, yup // Aca iria una cuenta
	   }
	   
	   def float getChapterRating(Series c){ //TODO crear chapter
	   	1.1f // cuenta para sacar rating, igual q arriba
	   }
	   
	   def List<Content> getContentByGenre(){
	   	//TODO 
	   }
	   
	   def List<Content> getContentBypgRating(){
	   	//TODO
	   }
	   
	   def int getSeriesSeasonsAll(Series s){
	   	s.getAllSeasons()
	   }
	   
	   def int getSeriesTotalChaptersAll(Series s){
	   	s.getAllChapters()
	   }
	   
	   def List<User> getUserFriends(User u){
	   	u.getFriends()
	   }
	   
	   def List<Movie> getUserMoviesSeen(User u){
	   	//TODO
	   }
	   
	   def List<Series> getUserSeriesSeen(User u){
	   	//TODO
	   }
	  
	   def List<Content> getUserRecommendedContent(User u){
	   	//TODO
	   } 
	   
	   def String obtenerElContenidoNocargadoDelTrailer(){
	   	//TODO no entiendo esto - J
	   }
	   
	   //TODO - Consultas extras
	   
}