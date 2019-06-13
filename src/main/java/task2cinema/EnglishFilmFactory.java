package task2cinema;

public class EnglishFilmFactory extends AbstractFilmFactory {
  private EnglishFilmFactory() {
  }

  @Override
  public Film setLanguage(Film film) {
    film.setSubtitlesLanguage(Languages.ENG);
    film.setVoiceLanguage(Languages.ENG);
    return film;
  }

  @Override
  public Film getFilm(String filmName) {
    return new Film(filmName, Languages.ENG, Languages.ENG);
  }


  public static class EnglishMovieFactoryInstance {
    public static EnglishFilmFactory getEnlishFilmFactory() {
      return new EnglishFilmFactory();
    }
  }
}
