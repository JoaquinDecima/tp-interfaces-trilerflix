package model.filterTests

import org.junit.jupiter.api.Test
import model.content.genre.Genre
import model.filter.GenreFilter
import org.junit.Assert

package class GenreFilterTests {
	package Genre genre1 = new Genre("filter")
	package Genre genre2 = new Genre("other")
	package GenreFilter filter = new GenreFilter("filter")

	@Test def package void test_filter_genre1_returns_true() {
		Assert.assertTrue(filter.filterGenre(genre1))
	}

	@Test def package void test_filter_genre2_returns_false() {
		Assert.assertFalse(filter.filterGenre(genre2))
	}
}
