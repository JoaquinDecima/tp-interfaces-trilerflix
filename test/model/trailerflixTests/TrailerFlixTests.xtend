package model.trailerflixTests

import static org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

import model.trailflix.Trailflix
import model.content.series.Series
import model.content.movie.Movie
import model.user.User

package class TrailerFlixTests {
	
	@Test def package void test() {
		fail("Not yet implemented")
	}
	
		@Test def void testX() {
		val tf = new Trailflix()
		val movie = new Movie()
		val series = new Series()
		tf.addNewContent(movie)
		tf.addNewContent(series)
		val user1 = new User(1, "username1", "user1", null, null)
		val user2 = new User(2, "username2", "user2", null, null)
		assertEquals(1, tf.getAllMovies())
		assertEquals(1, tf.getAllSeries())
		assertEquals(2, tf.getAllUsers())
	}
}
