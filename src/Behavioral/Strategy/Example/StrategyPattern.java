package Behavioral.Strategy.Example;

import Behavioral.Strategy.Example.Context.Context;
import Behavioral.Strategy.Example.Strategy_Variation.OperationAdd;
import Behavioral.Strategy.Example.Strategy_Variation.OperationMultiply;
import Behavioral.Strategy.Example.Strategy_Variation.OperationSubstract;

public class StrategyPattern {

  public static void main(String[] args) {
    Context context = new Context(new OperationAdd());
    System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

    context = new Context(new OperationSubstract());
    System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

    context = new Context(new OperationMultiply());
    System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
  }
}
