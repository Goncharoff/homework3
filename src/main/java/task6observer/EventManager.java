package task6observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
  private Map<String, List<Observer>> observers = new HashMap<>();

  EventManager(String... operations) {
    for (String operation : operations) {
      this.observers.put(operation, new ArrayList<>());
    }
  }

  void subscribe(String eventType, Observer observer) {
    List<Observer> clients = observers.get(eventType);
    clients.add(observer);
  }

  public void unsubscribe(String eventType, Observer observer) {
    List<Observer> clients = observers.get(eventType);
    clients.remove(observer);
  }

  void notify(String eventType) {
    List<Observer> clients = observers.get(eventType);

    for (Observer observer : clients) {
      observer.sendToClient(eventType);
    }

  }

}
