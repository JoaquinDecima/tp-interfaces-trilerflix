package model.filterTests;

import model.content.genre.Genre;
import model.filter.GenreFilter;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

@SuppressWarnings("all")
class GenreFilterTests {
  Genre genre1 = new Genre("filter");
  
  Genre genre2 = new Genre("other");
  
  GenreFilter filter = new GenreFilter("filter");
  
  @Test
  void test_filter_genre1_returns_true() {
    Assert.assertTrue((this.filter.filterGenre(this.genre1)).booleanValue());
  }
  
  @Test
  void test_filter_genre2_returns_false() {
    Assert.assertFalse((this.filter.filterGenre(this.genre2)).booleanValue());
  }
}
