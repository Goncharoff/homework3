package task2cinema;

import static task2cinema.Languages.ENG;
import static task2cinema.Languages.GER;

public class Client {

  public static void main(String[] args) {
    Film film = AbstractFilmFactory.getFactory(ENG).getFilm("HOhoHO");
    System.out.println(film);
    Film germanFilm = AbstractFilmFactory.getFactory(GER).getFilm("DU HAST MISH");
    System.out.println(germanFilm);
    AbstractFilmFactory.getFactory(ENG).setLanguage(germanFilm);
    System.out.println(germanFilm);
  }
}
