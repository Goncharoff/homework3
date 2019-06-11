package task2cinema;

abstract public class Film {
  String name;
  Languages voiceLanguage;
  Languages subtitlesLanguage;

  public Film(String name, Languages voiceLanguage) {
    this.name = name;
    this.voiceLanguage = voiceLanguage;
    this.subtitlesLanguage = voiceLanguage;
  }


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

}
