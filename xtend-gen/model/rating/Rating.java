package model.rating;

import model.content.Content;

@SuppressWarnings("all")
public class Rating {
  private int stars;
  
  private String username;
  
  private Content content;
  
  public Rating(final int stars, final String username, final Content content) {
    this.stars = stars;
    this.username = username;
    this.content = content;
  }
  
  public int getRatingStars() {
    return this.stars;
  }
  
  public String getRatingUsername() {
    return this.username;
  }
  
  public Content getRatingContent() {
    return this.content;
  }
}
