package model.filter;

import com.google.common.base.Objects;
import model.content.genre.Genre;
import model.filter.Filter;
import model.filtrable.Filtrable;

@SuppressWarnings("all")
public class GenreFilter implements Filter {
  private String filterGenreName;
  
  public GenreFilter(final String filterGenreName) {
    this.filterGenreName = filterGenreName;
  }
  
  @Override
  public Boolean filter(final Filtrable filtrable) {
    String _name = filtrable.getGenre().getName();
    return Boolean.valueOf(Objects.equal(this.filterGenreName, _name));
  }
  
  public Boolean filterGenre(final Genre genre) {
    String _name = genre.getName();
    return Boolean.valueOf(Objects.equal(this.filterGenreName, _name));
  }
}
