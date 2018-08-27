package model.content;

import java.util.ArrayList;
import model.content.pgRating.AgeCategory;

@SuppressWarnings("all")
public interface Content {
  public final static int id;
  
  public final static String title;
  
  public final static String category;
  
  public final static AgeCategory clasification;
  
  public final static int duration;
  
  public final static ArrayList<Content> similarContent = new ArrayList<Content>();
  
  /**
   * Getters
   */
  public default int getID() {
    return Content.id;
  }
  
  public default String getTitle() {
    return this.getTitle();
  }
  
  public default String getCategory() {
    return this.getCategory();
  }
  
  public default AgeCategory getCasification() {
    return Content.clasification;
  }
  
  public default int getDuration() {
    return this.getDuration();
  }
  
  public default ArrayList<String> getSimilarContent() {
    return this.getSimilarContent();
  }
  
  /**
   * Setters
   */
  public default Object setTitle(final String sTitle) {
    return this.setTitle(sTitle);
  }
  
  public default Object setCategory(final String sCategory) {
    return this.setCategory(sCategory);
  }
  
  public default Object setDuration(final int iDuration) {
    return this.setDuration(iDuration);
  }
  
  /**
   * Manejo de Contenido similar
   */
  public default boolean addSimilarContent(final Content cNewContent) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Content to String");
  }
}
