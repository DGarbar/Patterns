package Behavioral.Interpreter.Example.SimpleEx1.Context;

import Behavioral.Interpreter.Example.SimpleEx1.Expression.AddExpression;
import Behavioral.Interpreter.Example.SimpleEx1.Expression.Expression;
import Behavioral.Interpreter.Example.SimpleEx1.Expression.NumberExpression;
import Behavioral.Interpreter.Example.SimpleEx1.Expression.SubtractExpression;

public class Context {

  /*
   * Start counting from the right to the left.
   * We take on 1 number per iteration.
   */
  public Expression calculate(String exp) {
    int pos = exp.length() - 1;
    while (pos > 0) {
      if (Character.isDigit(exp.charAt(pos))) {
        pos--;
      } else {
        Expression left = calculate(exp.substring(0, pos));
        Expression right = new NumberExpression(
          Integer.valueOf(exp.substring(pos + 1, exp.length())));
        char operator = exp.charAt(pos);
        switch (operator) {
          case '-':
            return new SubtractExpression(left, right);
          case '+':
            return new AddExpression(left, right);
        }
      }
    }
    //When we get only one number
    int result = Integer.valueOf(exp);
    return new NumberExpression(result);
  }
}
