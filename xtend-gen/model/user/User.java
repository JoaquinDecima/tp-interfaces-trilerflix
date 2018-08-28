package model.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.content.Content;

@SuppressWarnings("all")
public class User {
  private int idCode;
  
  private String username;
  
  private String name;
  
  private Date registerDate;
  
  private Date birthDate;
  
  private List<User> friends;
  
  private List<Content> viewedContent;
  
  private List<Content> favoriteContent;
  
  private List<Content> recommendedContent;
  
  public User(final int idCode, final String username, final String name, final Date registerDate, final Date birthDate) {
    this.idCode = idCode;
    this.username = username;
    this.name = name;
    this.registerDate = registerDate;
    this.birthDate = birthDate;
    ArrayList<User> _arrayList = new ArrayList<User>();
    this.friends = _arrayList;
    ArrayList<Content> _arrayList_1 = new ArrayList<Content>();
    this.viewedContent = _arrayList_1;
    ArrayList<Content> _arrayList_2 = new ArrayList<Content>();
    this.favoriteContent = _arrayList_2;
    ArrayList<Content> _arrayList_3 = new ArrayList<Content>();
    this.recommendedContent = _arrayList_3;
  }
  
  public int getIdCode() {
    return this.idCode;
  }
  
  public String getUsername() {
    return this.username;
  }
  
  public String getName() {
    return this.name;
  }
  
  public Date getRegisterDate() {
    return this.registerDate;
  }
  
  public Date getBirthDate() {
    return this.birthDate;
  }
  
  public List<User> getFriends() {
    return this.friends;
  }
  
  public List<Content> getViewedContent() {
    return this.viewedContent;
  }
  
  public List<Content> getFavoriteContent() {
    return this.favoriteContent;
  }
  
  public List<Content> getRecommendedContent() {
    return this.recommendedContent;
  }
}
