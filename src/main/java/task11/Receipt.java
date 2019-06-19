package task11;

import java.util.Date;

public class Receipt implements ReceiptProxy {
  private Date date;
  private String text;

  public Receipt(Date date, String text) {
    this.date = date;
    this.text = text;
  }

  @Override
  public Date getDate() {
    return date;
  }

  @Override
  public String getText() {
    return text;
  }
}
