package task6observer;

public class MagazineNotificationListener implements Observer {
  private Magazine magazine;
  private String clientAddress;

  public MagazineNotificationListener(Magazine magazine, String clientAddress) {
    this.magazine = magazine;
    this.clientAddress = clientAddress;
  }

  @Override
  public void sendToClient(String eventType) {
    System.out.println(eventType + " to client with address " + clientAddress + " was delivered magazine: " + magazine.getTitle());
  }
}
