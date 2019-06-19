package task8chain;

public class OrdinaryOperation extends AbstractBankSystem {
    private static final int ORDINARY_COEF = 5;

    public OrdinaryOperation(int code, int sum) {
        this.code = code;
        this.sum = sum;
    }

    @Override
    protected int calculate(int sum) {
        System.out.println("Calculating ordinary operation");
        return sum - (sum / ORDINARY_COEF);
    }
}
