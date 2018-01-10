package Behavioral.Interpreter.Example.SimpleEx1.Expression;

public class NumberExpression implements Expression {

  private int number;

  public NumberExpression(int number) {
    this.number = number;
  }

  @Override
  public int interpret() {
    return number;
  }
}
