package model.person;

@SuppressWarnings("all")
public class Person {
  private String name;
  
  private String profession;
  
  public Person(final String name, final String profession) {
    this.name = name;
    this.profession = profession;
  }
  
  public String getPersonName() {
    return this.name;
  }
  
  public String getPersonProfession() {
    return this.profession;
  }
}
