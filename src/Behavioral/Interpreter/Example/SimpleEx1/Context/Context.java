package Behavioral.Interpreter.Example.SimpleEx1.Context;

import Behavioral.Interpreter.Example.SimpleEx1.Expression.AddExpression;
import Behavioral.Interpreter.Example.SimpleEx1.Expression.DerogateExpression;
import Behavioral.Interpreter.Example.SimpleEx1.Expression.Expression;
import Behavioral.Interpreter.Example.SimpleEx1.Expression.NumberExpression;

public class Context {

  public Expression evaluate(String exp) {
    int pos = exp.length() - 1;
    while (pos > 0) {
      if (Character.isDigit(exp.charAt(pos))) {
        pos--;
      } else {
        Expression left = evaluate(exp.substring(0, pos));
        Expression right = new NumberExpression(
          Integer.valueOf(exp.substring(pos + 1, exp.length())));
        char operator = exp.charAt(pos);
        switch (operator) {
          case '-':
            return new DerogateExpression(left, right);
          case '+':
            return new AddExpression(left, right);
        }
      }
    }
    //if we get only number
    int result = Integer.valueOf(exp);
    return new NumberExpression(result);
  }
}
