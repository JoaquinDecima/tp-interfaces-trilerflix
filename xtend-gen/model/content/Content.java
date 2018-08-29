package model.content;

import java.util.List;
import model.content.genre.Genre;
import model.content.pgRating.AgeCategory;

@SuppressWarnings("all")
public abstract class Content {
  private int id;
  
  private String title;
  
  private List<Genre> genres;
  
  private AgeCategory clasification;
  
  private int runtime;
  
  private List<Content> similarContent;
  
  /**
   * Getters
   */
  public int getID() {
    return this.id;
  }
  
  public String getTitle() {
    return this.title;
  }
  
  public List<Genre> getGenres() {
    return this.genres;
  }
  
  public AgeCategory getCasification() {
    return this.clasification;
  }
  
  public int getDuration() {
    return this.getDuration();
  }
  
  public List<Content> getSimilarContent() {
    return this.similarContent;
  }
  
  /**
   * Setters
   */
  public void setTitle(final String sTitle) {
    this.title = sTitle;
  }
  
  public void setGenres(final List<Genre> sGenres) {
    this.genres = sGenres;
  }
  
  public void setDuration(final int sRuntime) {
    this.runtime = sRuntime;
  }
  
  /**
   * Manejo de Contenido similar
   */
  public void addSimilarContent(final Content cNewContent) {
    this.similarContent.add(cNewContent);
  }
}
