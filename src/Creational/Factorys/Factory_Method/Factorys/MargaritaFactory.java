package Creational.Factorys.Factory_Method.Factorys;

import Creational.Factorys.Factory_Method.Products.Margarita;
import Creational.Factorys.Factory_Method.Products.Pizza;

public class MargaritaFactory extends PizzaFactory {

  @Override
  protected Pizza makePizza() {
    return new Margarita();
  }
}
