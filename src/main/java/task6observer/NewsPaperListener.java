package task6observer;

public class NewsPaperListener implements Observer {
  private Newspaper newspaper;
  private String clientAddress;

  public NewsPaperListener(Newspaper newspaper, String clientAddress) {
    this.newspaper = newspaper;
    this.clientAddress = clientAddress;
  }

  @Override
  public void sendToClient(String eventType) {
    System.out.println(eventType + " to client with address " + clientAddress + " was delivered magazine: " + newspaper.getTitle());
  }

}
