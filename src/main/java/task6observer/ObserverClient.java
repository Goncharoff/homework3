package task6observer;

public class ObserverClient {

  public static void main(String[] args) {
    Postamp postamp = new Postamp();

    postamp.events
            .subscribe(
                    "Deliver magazine",
                    new MagazineNotificationListener(
                            new Magazine("Really great magazine!", "Text of paper"),
                            "London"
                    )
            );

    postamp.events
            .subscribe(
                    "Deliver newspaper",
                    new NewsPaperListener(
                            new Newspaper("Times", "Text of the newspaper"),
                            "Kiev"
                    )
            );


    postamp.sendMagazine("Really great magazine!");
    postamp.sendNewspapaer("Times");
  }
}
