package task8chain;

public class ChanClient {
    public static AbstractBankSystem getChainOfOperations() {
        int sum = 100;
        AbstractBankSystem govermenOperation = new GovermentOperation(AbstractBankSystem.ORDINARY_GOVERMENT_CODE, sum);
        AbstractBankSystem insideOperation = new InideOperation(AbstractBankSystem.ORDINARY_INSIDE_BANK_CODE, sum);
        AbstractBankSystem ordinaryOperation = new OrdinaryOperation(AbstractBankSystem.ORDINARY_OPERATION_CODE, sum);
        AbstractBankSystem specialOperation = new SpecialOperation(AbstractBankSystem.ORDINARY_SPECIAL_CODE, sum);

        govermenOperation.setBankSystem(insideOperation);
        govermenOperation.setBankSystem(ordinaryOperation);
        govermenOperation.setBankSystem(specialOperation);

        return govermenOperation;
    }

    public static void main(String[] args) {
        AbstractBankSystem bankOperationChain = getChainOfOperations();

        bankOperationChain.doOperation(AbstractBankSystem.ORDINARY_SPECIAL_CODE, "test message");
    }
}
