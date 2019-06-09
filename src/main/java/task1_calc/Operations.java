package task1_calc;

public enum Operations {
    LEFT_BRACKET("(") {
        @Override
        public int getPriorityNumber() {
            return 0;
        }
    },
    RIGHT_BRACKET(")") {
        @Override
        public int getPriorityNumber() {
            return 1;
        }
    },
    PLUS("+") {
        @Override
        public int getPriorityNumber() {
            return 2;
        }
    },
    MINUS("-") {
        @Override
        public int getPriorityNumber() {
            return 3;
        }
    },
    MULTIPLY("*") {
        @Override
        public int getPriorityNumber() {
            return 4;
        }
    },
    SUBSTRACTION("/"){
        @Override
        public int getPriorityNumber() {
            return 4;
        }
    };

    private String operation;

    Operations(String operation) {
        this.operation = operation;
    }

    public abstract int getPriorityNumber();
}
