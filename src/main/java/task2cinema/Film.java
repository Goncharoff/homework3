package task2cinema;

public class Film {
  private String name;
  private Languages voiceLanguage;
  private Languages subtitlesLanguage;

  public Film(String name, Languages voiceLanguage, Languages subtitlesLanguage) {
    this.name = name;
    this.voiceLanguage = voiceLanguage;
    this.subtitlesLanguage = subtitlesLanguage;
  }

  public String getName() {
    return name;
  }

  public Languages getVoiceLanguage() {
    return voiceLanguage;
  }

  public Languages getSubtitlesLanguage() {
    return subtitlesLanguage;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setVoiceLanguage(Languages voiceLanguage) {
    this.voiceLanguage = voiceLanguage;
  }

  public void setSubtitlesLanguage(Languages subtitlesLanguage) {
    this.subtitlesLanguage = subtitlesLanguage;
  }

  @Override
  public String toString() {
    return "Film{" +
            "name='" + name + '\'' +
            ", voiceLanguage=" + voiceLanguage +
            ", subtitlesLanguage=" + subtitlesLanguage +
            '}';
  }
}
