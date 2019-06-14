package task11;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Client {

  public static void main(String[] args) throws InterruptedException {
    ReceiptProxy oldReceipt = new Receipt(new Date(), "Some receipt text");
    System.out.println(oldReceipt.getDate());
    System.out.println(oldReceipt.getText());


    TimeUnit.SECONDS.sleep(2);

    ReceiptProxy newRecept = new NewReceipt(oldReceipt);
    System.out.println(newRecept.getDate());
    System.out.println(newRecept.getText());
  }
}
