package task8chain;

public class InideOperation extends AbstractBankSystem {
    private static final int INSIDE_BANK_KOEF = 10;

    public InideOperation(int code, int sum) {
        this.code = code;
        this.sum = sum;
    }

    @Override
    protected int calculate(int sum) {
        System.out.println("calculating inside operation");
        return sum + sum * INSIDE_BANK_KOEF;
    }
}
