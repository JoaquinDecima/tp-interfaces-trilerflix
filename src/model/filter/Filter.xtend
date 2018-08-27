package model.filter

import model.filtrable.Filtrable

interface Filter {
	
	def Boolean filter(Filtrable filtrable)
}