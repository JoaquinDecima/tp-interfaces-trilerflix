package model.content

import model.content.pgRating.AgeCategory
import model.content.genre.Genre
import java.util.ArrayList
import java.util.List

abstract class Content {
	int id
	String title
	List<Genre> genres
	AgeCategory clasification
	int runtime;
	List<Content> similarContent; // = new ArrayList<Content>();
	
	/*
	 * Getters
	 * 
	 */
	 
	 // Retorna ID
	 def int getID(){
	 	return (this.id);
	 }
	 
	 // Retorna Titulo
	 def String getTitle(){
	 	return(this.title);
	 }
	 
	 //Retorna categoria
	 def List<Genre> getGenres(){
	 	return this.genres;
	 }
	 
	 //Retorna clasificacion
	 def AgeCategory getCasification(){
	 	return this.clasification;
	 }
	 
	 //Retorna duracion
	 def int getDuration(){
	 	return (this.duration);
	 }
	 
	 def List<Content> getSimilarContent(){
	 	return (this.similarContent);
	 }
	 
	 /*
	  * Setters
	  * 
	  */
	  
	  //Setea Nuevo Titulo
	  def void setTitle(String sTitle){
	  	this.title = sTitle;
	  }
	  
	  //Setea nueva categoria
	  def void setGenres(List<Genre> sGenres){
	  	this.genres = sGenres
	  }
	  
	  //Setea Duracion
	  def void setDuration(int sRuntime){
	  	this.runtime = sRuntime;
	  }
	  
	  
	  /*
	   * Manejo de Contenido similar
	   * 
	   */
	   
	   //Agrega nuevo contenido similar
	   def void addSimilarContent(Content cNewContent){
	   	 this.similarContent.add( cNewContent);		
	   }
}
