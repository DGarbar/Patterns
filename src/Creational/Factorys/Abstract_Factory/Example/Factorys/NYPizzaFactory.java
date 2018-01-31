package Creational.Factorys.Abstract_Factory.Example.Factorys;

import Creational.Factorys.Abstract_Factory.Example.Products.Pizzas.Margarita.Margarita;
import Creational.Factorys.Abstract_Factory.Example.Products.Pizzas.Margarita.NYMargarita;
import Creational.Factorys.Abstract_Factory.Example.Products.Pizzas.Neapolitan.NYNeapolitan;
import Creational.Factorys.Abstract_Factory.Example.Products.Pizzas.Neapolitan.Neapolitan;

public class NYPizzaFactory implements PizzaFactory {

  @Override
  public Neapolitan makeNeapolitan() {

    // Create new specific Neapolitan

    return new NYNeapolitan();
  }

  @Override
  public Margarita makeMargarita() {

    // Create new specific Margarita

    return new NYMargarita();
  }
}
