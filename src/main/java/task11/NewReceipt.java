package task11;

import java.util.Date;

public class NewReceipt implements ReceiptProxy{
  private Date newDate;
  private ReceiptProxy oldReceipt;

  public NewReceipt(ReceiptProxy oldReceipt) {
    this.oldReceipt = oldReceipt;
    this.newDate = new Date();
  }

  @Override
  public Date getDate() {
    return newDate;
  }

  @Override
  public String getText() {
    return oldReceipt.getText();
  }
}
