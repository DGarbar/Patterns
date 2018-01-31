package Behavioral.Interpreter.Example.SimpleEx2;

import Behavioral.Interpreter.Example.SimpleEx2.Expression.AndExpression;
import Behavioral.Interpreter.Example.SimpleEx2.Expression.Expression;
import Behavioral.Interpreter.Example.SimpleEx2.Expression.OrExpression;
import Behavioral.Interpreter.Example.SimpleEx2.Expression.TerminalExpression;

//We use recursion for wrap different Expression

public class Ex {


  public static void main(String[] args) {
    Expression isGay = getGayExpression(
      new TerminalExpression("Vlad"),
      new TerminalExpression("Dima"));
    Expression isInLove = getStateExpression(
      new TerminalExpression("Tanya"),
      new TerminalExpression("inLove")
    );

    System.out.println("Is Vlad gay? " + isGay.interpret("Vlad"));
    System.out.println("Is Tanya is in Love? " + isInLove.interpret("Tanya is inLove?"));
  }

  //Rule: Dima and Vlad Geys
  public static Expression getGayExpression(Expression person1, Expression person2) {
    return new OrExpression(person1, person2);
  }

  //Rule: Tanya in love
  public static Expression getStateExpression(Expression ex1, Expression ex2) {
    return new AndExpression(ex1, ex2);
  }
}

