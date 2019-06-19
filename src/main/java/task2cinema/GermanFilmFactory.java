package task2cinema;

public class GermanFilmFactory extends AbstractFilmFactory{

  private GermanFilmFactory() {
  }

  @Override
  public Film setLanguage(Film film) {
    film.setSubtitlesLanguage(Languages.GER);
    film.setVoiceLanguage(Languages.GER);
    return film;
  }

  @Override
  public Film getFilm(String filmName) {
    return new Film(filmName, Languages.GER, Languages.GER);
  }

  public static class GermanMovieFactoryInstance {
    public static GermanFilmFactory getGermanFilmFactory() {
      return new GermanFilmFactory();
    }
  }
}
