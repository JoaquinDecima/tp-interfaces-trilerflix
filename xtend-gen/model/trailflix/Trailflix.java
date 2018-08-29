package model.trailflix;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import model.content.Content;
import model.content.genre.Genre;
import model.content.movie.Movie;
import model.content.series.Series;
import model.person.Person;
import model.user.User;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Trailflix {
  private ArrayList<User> users;
  
  private ArrayList<Person> casts;
  
  private ArrayList<Genre> genres;
  
  private ArrayList<Content> content;
  
  public Trailflix() {
  }
  
  public Trailflix(final ArrayList<User> theUsers, final ArrayList<Person> theCasts, final ArrayList<Genre> theGenres, final ArrayList<Content> theContent) {
    this.users = theUsers;
    this.casts = theCasts;
    this.genres = theGenres;
    this.content = theContent;
  }
  
  /**
   * GET_TERS
   */
  public ArrayList<User> getUsers() {
    return this.users;
  }
  
  public ArrayList<Person> getCasts() {
    return this.casts;
  }
  
  public ArrayList<Genre> getGenres() {
    return this.genres;
  }
  
  public ArrayList<Content> getContent() {
    return this.content;
  }
  
  /**
   * SET_TERS
   */
  public void setUsers(final ArrayList<User> newUsers) {
    this.users = newUsers;
  }
  
  public void setCasts(final ArrayList<Person> newCasts) {
    this.casts = newCasts;
  }
  
  public void setGenres(final ArrayList<Genre> newGenres) {
    this.genres = newGenres;
  }
  
  public void setContent(final ArrayList<Content> newContent) {
    this.content = newContent;
  }
  
  /**
   * T_T
   */
  public void addAUser(final User newUser) {
    this.users.add(newUser);
  }
  
  public void addACastMember(final Person newCastMember) {
    this.casts.add(newCastMember);
  }
  
  public void addNewGenre(final Genre newGenre) {
    this.genres.add(newGenre);
  }
  
  public void addNewContent(final Content newContent) {
    this.content.add(newContent);
  }
  
  /**
   * TODO << find a user, content, genre, castMember y testear >>
   */
  public List<Movie> getAllMovies() {
    return IterableExtensions.<Movie>toList(Iterables.<Movie>filter(this.content, Movie.class));
  }
  
  public List<Series> getAllSeries() {
    return IterableExtensions.<Series>toList(Iterables.<Series>filter(this.content, Series.class));
  }
  
  public List<User> getAllUsers() {
    return this.users;
  }
  
  public float getMovieRating(final Movie m) {
    return 1.1f;
  }
  
  public float getChapterRating(final Series c) {
    return 1.1f;
  }
  
  public List<Content> getContentByGenre() {
    return null;
  }
  
  public List<Content> getContentBypgRating() {
    return null;
  }
  
  public int getSeriesSeasonsAll(final Series s) {
    return s.getAllSeasons();
  }
  
  public int getSeriesTotalChaptersAll(final Series s) {
    return s.getAllChapters();
  }
  
  public List<User> getUserFriends(final User u) {
    return u.getFriends();
  }
  
  public List<Movie> getUserMoviesSeen(final User u) {
    return null;
  }
  
  public List<Series> getUserSeriesSeen(final User u) {
    return null;
  }
  
  public List<Content> getUserRecommendedContent(final User u) {
    return null;
  }
  
  public String obtenerElContenidoNocargadoDelTrailer() {
    return null;
  }
}
