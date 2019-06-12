package task8chain;

public abstract class AbstractBankSystem {
  public static int ORDINARY_OPERATION_CODE = 1;
  public static int ORDINARY_SPECIAL_CODE = 2;
  public static int ORDINARY_GOVERMENT_CODE = 3;
  public static int ORDINARY_INSIDE_BANK_CODE = 4;

  protected int sum;
  protected int code;
  protected AbstractBankSystem nextSystem;

  public AbstractBankSystem(AbstractBankSystem nextSystem, int sum) {
    this.nextSystem = nextSystem;
    this.sum = sum;
  }

  public void doOperation(int code, String message) {
    if (this.code <= code) calculate(sum);
    if (nextSystem != null) nextSystem.doOperation(code, message);
  }

  abstract protected int calculate(int sum);
}
