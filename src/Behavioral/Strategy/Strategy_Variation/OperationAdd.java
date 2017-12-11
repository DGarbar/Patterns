package Behavioral.Strategy.Strategy_Variation;

public class OperationAdd implements IStrategy {

  @Override
  public int doOperation(int num1, int num2) {
    return num1 + num2;
  }
}
