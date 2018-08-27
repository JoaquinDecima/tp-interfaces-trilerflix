package model.filter;

import com.google.common.base.Objects;
import model.content.pgRating.AgeCategory;
import model.filter.Filter;
import model.filtrable.Filtrable;

@SuppressWarnings("all")
public class AgeCategoryFilter implements Filter {
  private AgeCategory filterCategory;
  
  public AgeCategoryFilter(final AgeCategory filterCategory) {
    this.filterCategory = filterCategory;
  }
  
  @Override
  public Boolean filter(final Filtrable filtrable) {
    AgeCategory _category = filtrable.getCategory();
    return Boolean.valueOf(Objects.equal(this.filterCategory, _category));
  }
}
