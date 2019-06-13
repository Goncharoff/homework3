package task2cinema;


public abstract class AbstractFilmFactory {

  public static AbstractFilmFactory getFactory(Languages language) {

    if (language == null) return null;

    switch (language) {
      case ENG:
        return EnglishFilmFactory.EnglishMovieFactoryInstance.getEnlishFilmFactory();
      case GER:
        return GermanFilmFactory.GermanMovieFactoryInstance.getGermanFilmFactory();
      default:
        throw new UnknownFilmException("Can not find film with such language " + language);
    }

  }

  public abstract Film setLanguage(Film film);

  public abstract Film getFilm(String filmName);

}
