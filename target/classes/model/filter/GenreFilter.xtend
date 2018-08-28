package model.filter

import model.filtrable.Filtrable
import model.content.genre.Genre

class GenreFilter implements Filter{
	
	String filterGenreName
	
	new(String filterGenreName){
		this.filterGenreName = filterGenreName
	}
	
	override filter(Filtrable filtrable) {
		filterGenreName == filtrable.getGenre().getName()
	}
	
	def Boolean filterGenre(Genre genre){
		filterGenreName == genre.getName();
	}
	
}