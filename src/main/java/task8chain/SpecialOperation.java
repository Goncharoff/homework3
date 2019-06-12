package task8chain;

public class SpecialOperation extends AbstractBankSystem {

    public SpecialOperation(int code, int sum) {
        this.code = code;
        this.sum = sum;
    }

    @Override
    protected int calculate(int sum) {
        System.out.println("Calculating special");
        return sum;
    }
}
