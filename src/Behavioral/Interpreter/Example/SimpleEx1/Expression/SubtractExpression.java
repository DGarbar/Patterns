package Behavioral.Interpreter.Example.SimpleEx1.Expression;

public class SubtractExpression implements Expression {

  private final Expression num1;
  private final Expression num2;

  public SubtractExpression(Expression num1, Expression num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  @Override
  public int interpret() {
    return num1.interpret() - num2.interpret();
  }
}
