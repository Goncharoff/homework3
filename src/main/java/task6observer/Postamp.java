package task6observer;

public class Postamp {
  public EventManager events;

  public Postamp() {
    this.events = new EventManager("Deliver newspaper", "Deliver magazine");
  }

  public void sendMagazine(String magazine) {
    events.notify("Deliver magazine");
  }

  public void sendNewspapaer(String eventType) {
    events.notify("Deliver newspaper");
  }
}
