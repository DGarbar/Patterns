package Behavioral.Strategy.Example.Context;

import Behavioral.Strategy.Example.Strategy_Variation.IStrategy;

public class Context {

  private IStrategy strategy;

  public Context(IStrategy strategy) {
    this.strategy = strategy;
  }

  //or with Setter

  public void setStrategy(IStrategy strategy) {
    this.strategy = strategy;
  }

  //do work with super class (interface)

  public double executeStrategy(int num1, int num2) {
    return strategy.doOperation(num1, num2);
  }
}
