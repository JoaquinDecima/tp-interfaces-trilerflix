package model.filtrable

import model.content.genre.Genre
import model.content.pgRating.AgeCategory

interface Filtrable {
	
	def AgeCategory getCategory();
	
	def Genre getGenre();
}