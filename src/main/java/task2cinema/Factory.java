package task2cinema;

public abstract class Factory {
  private static Factory filmsFactory = null;

  public abstract String getLanguage();

  public abstract String getSubtitlesLanguage();

  public static Factory getFactory(String language) throws UnknownLanguageException {

    if (language == null) {
      return null;
    }


    Factory factory = null;

    switch (language) {
      case "UA":
        if()
        break;

      case "UK":
        break;

      case "GER":
        break;

      default:
        throw new UnknownLanguageException();
    }

    return factory;
  }
}
