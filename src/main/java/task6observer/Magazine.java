package task6observer;

public class Magazine implements StoreItem {
  private String title;
  private String text;

  public Magazine(String title, String text) {
    this.title = title;
    this.text = text;
  }


  public String getTitle() {
    return title;
  }

  public String getText() {
    return text;
  }

}
