package Creational.Factorys.Factory_Method.Example.Factorys;

import Creational.Factorys.Factory_Method.Example.Products.Neapolitan;
import Creational.Factorys.Factory_Method.Example.Products.Pizza;

public class NeapolitanFactory extends PizzaFactory {

  @Override
  protected Pizza makePizza() {
    return new Neapolitan();
  }
}
