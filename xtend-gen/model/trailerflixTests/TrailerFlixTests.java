package model.trailerflixTests;

import model.content.movie.Movie;
import model.content.series.Series;
import model.trailflix.Trailflix;
import model.user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@SuppressWarnings("all")
class TrailerFlixTests {
  @Test
  void test() {
    Assertions.<Object>fail("Not yet implemented");
  }
  
  @Test
  public void testX() {
    final Trailflix tf = new Trailflix();
    final Movie movie = new Movie();
    final Series series = new Series();
    tf.addNewContent(movie);
    tf.addNewContent(series);
    final User user1 = new User(1, "username1", "user1", null, null);
    final User user2 = new User(2, "username2", "user2", null, null);
    Assertions.assertEquals(Integer.valueOf(1), tf.getAllMovies());
    Assertions.assertEquals(Integer.valueOf(1), tf.getAllSeries());
    Assertions.assertEquals(Integer.valueOf(2), tf.getAllUsers());
  }
}
