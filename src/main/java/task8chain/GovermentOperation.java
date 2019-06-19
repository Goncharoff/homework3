package task8chain;

public class GovermentOperation extends AbstractBankSystem {
    private static final int GOVERMENT_COEF = 100;

    public GovermentOperation(int code, int sum) {
        this.code = code;
        this.sum = sum;
    }

    @Override
    protected int calculate(int sum) {
        System.out.println("Calculating goverment operation");
        return sum * 100;
    }
}
