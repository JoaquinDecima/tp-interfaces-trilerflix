package model.content

import model.content.pgRating.AgeCategory
import java.util.ArrayList

interface Content {
	int id;
	String title;
	String category;
	AgeCategory clasification;
	int duration;
	ArrayList<Content> similarContent = new ArrayList<Content>();
	
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
	 def String getCategory(){
	 	return(this.category);
	 }
	 
	 //Retorna clasificacion
	 def AgeCategory getCasification(){
	 	return(this.clasification);
	 }
	 
	 //Retorna duracion
	 def int getDuration(){
	 	return (this.duration);
	 }
	 
	 def ArrayList<String> getSimilarContent(){
	 	return (this.similarContent);
	 }
	 
	 /*
	  * Setters
	  * 
	  */
	  
	  //Setea Nuevo Titulo
	  def setTitle(String sTitle){
	  	this.title = sTitle;
	  }
	  
	  //Setea nueva categoria
	  def setCategory(String sCategory){
	  	this.category = sCategory;
	  }
	  
	  //Setea Duracion
	  def setDuration(int iDuration){
	  	this.duration = iDuration;
	  }
	  
	  
	  /*
	   * Manejo de Contenido similar
	   * 
	   */
	   
	   //Agrega nuevo contenido similar
	   def addSimilarContent(Content cNewContent){
	   	 this.similarContent.add(cNewContent);		// TODO: Error de String que no entiendo 
	   }
}
