package model.filtrable;

import model.content.genre.Genre;
import model.content.pgRating.AgeCategory;

@SuppressWarnings("all")
public interface Filtrable {
  public abstract AgeCategory getCategory();
  
  public abstract Genre getGenre();
}
