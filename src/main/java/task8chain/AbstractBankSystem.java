package task8chain;

public abstract class AbstractBankSystem {
    public static int ORDINARY_OPERATION_CODE = 1;
    public static int ORDINARY_SPECIAL_CODE = 2;
    public static int ORDINARY_GOVERMENT_CODE = 3;
    public static int ORDINARY_INSIDE_BANK_CODE = 4;

    protected int sum;
    protected int code;
    protected AbstractBankSystem nextSystem;

    public void setBankSystem(AbstractBankSystem nextSystem) {
        this.nextSystem = nextSystem;
    }

    public void doOperation(int code, String message) {
        System.out.println("Current code = " + code + " " + message);
        if (this.code <= code) System.out.println(calculate(sum));
        if (nextSystem != null) nextSystem.doOperation(code, message);
    }

    abstract protected int calculate(int sum);
}
