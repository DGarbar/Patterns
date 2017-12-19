package Creational.Factorys.Abstract_Factory.Factorys;

import Creational.Factorys.Abstract_Factory.Products.Pizzas.Margarita.Margarita;
import Creational.Factorys.Abstract_Factory.Products.Pizzas.Margarita.NYMargarita;
import Creational.Factorys.Abstract_Factory.Products.Pizzas.Neapolitan.NYNeapolitan;
import Creational.Factorys.Abstract_Factory.Products.Pizzas.Neapolitan.Neapolitan;

public class NYPizzaFactory implements PizzaFactory {

  @Override
  public Neapolitan makeNeapolitan() {

    // create new specific Neapolitan

    return new NYNeapolitan();
  }

  @Override
  public Margarita makeMargarita() {

    // create new specific Margarita

    return new NYMargarita();
  }
}
