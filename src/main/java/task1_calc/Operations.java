package task1_calc;

import java.util.HashMap;
import java.util.Map;

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
      return 0;
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
  SUBTRACTION("/") {
    @Override
    public int getPriorityNumber() {
      return 4;
    }
  };

  private String operation;

  Operations(String operation) {
    this.operation = operation;
  }

  private static final Map<String, Operations> lookup = new HashMap<>();

  static {
    for (Operations operation : Operations.values()) {
      lookup.put(operation.getOperationSymbol(), operation);
    }
  }

  public String getOperationSymbol() {
    return operation;
  }

  public static int getOperationPriorityBySymbol(String operation) {
    return lookup.get(operation).getPriorityNumber();
  }

  public int getPriorityNumber() {
    return -1;
  }



}
