package task2cinema;

public abstract class AbstractFilmFactory {
  private static AbstractFilmFactory gameOfThronesFactory = null;
  private static AbstractFilmFactory someArthouseFactory = null;

  public abstract Film getVoiceLanguage();

  public abstract Film getSubtitleLanguage();

  public static AbstractFilmFactory AbstractFilmFactory(String filmName, Languages language) {

    if (filmName == null || language == null) return null;


    AbstractFilmFactory factory;

    switch (filmName) {
      case "game of thrones just failed":
        if (gameOfThronesFactory == null) return new GameOfThronesFactory(language);
        factory = gameOfThronesFactory;
        break;
      case "art-house":
        if (someArthouseFactory == null) return new SomeArthouseFactory(language);
        factory = someArthouseFactory;
        break;
      default:
        throw new UnknownFilmException("Can not find film with name " + filmName);
    }

    return factory;
  }

}
