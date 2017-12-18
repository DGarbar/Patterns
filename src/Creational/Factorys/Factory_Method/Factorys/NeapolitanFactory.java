package Creational.Factorys.Factory_Method.Factorys;

import Creational.Factorys.Factory_Method.Products.Neapolitan;
import Creational.Factorys.Factory_Method.Products.Pizza;

public class NeapolitanFactory extends PizzaFactory {

  @Override
  protected Pizza makePizza() {
    return new Neapolitan();
  }
}
