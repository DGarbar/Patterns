package Creational.Factorys.Factory_Method.Example.Factorys;

import Creational.Factorys.Factory_Method.Example.Products.Margarita;
import Creational.Factorys.Factory_Method.Example.Products.Pizza;

public class MargaritaFactory extends PizzaFactory {

  @Override
  protected Pizza makePizza() {
    return new Margarita();
  }
}
