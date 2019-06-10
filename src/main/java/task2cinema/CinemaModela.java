package task2cinema;

public class CinemaModela {
  private String name;
  private String language;
  private String subtitles;

  public CinemaModela(String name, String language, String subtitles) {
    this.name = name;
    this.language = language;
    this.subtitles = subtitles;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getSubtitles() {
    return subtitles;
  }

  public void setSubtitles(String subtitles) {
    this.subtitles = subtitles;
  }
}
