package model.filter

import model.filtrable.Filtrable
import model.content.pgRating.AgeCategory

class AgeCategoryFilter implements Filter{
	
	AgeCategory filterCategory;
	
	new(AgeCategory filterCategory){
		this.filterCategory = filterCategory
	} 
	
	override filter(Filtrable filtrable) {
			filterCategory == filtrable.getCategory();
	}
	
}