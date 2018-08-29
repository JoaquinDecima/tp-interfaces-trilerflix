package model.trailflix;

import java.util.ArrayList;
import model.content.Content;
import model.content.genre.Genre;
import model.person.Person;
import model.user.User;

@SuppressWarnings("all")
public class Trailflix {
  private ArrayList<User> users;
  
  private ArrayList<Person> casts;
  
  private ArrayList<Genre> genres;
  
  private ArrayList<Content> content;
  
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
}
