package Behavioral.Interpreter.Example.SimpleEx1;

import Behavioral.Interpreter.Example.SimpleEx1.Context.Context;
import Behavioral.Interpreter.Example.SimpleEx1.Expression.Expression;

/*
 * Calculate expression ([0-9]*\+|-[0-9]*)*
 */
public class Ex {

  //5+2-43+2 = -34
  public static void main(String[] args) {
    Context context = new Context();
    Expression expression = context.calculate("5+2-43+2");
    System.out.println(expression.interpret());
  }

}
