package Creational.Factorys.Abstract_Factory.Example.Factorys;

import Creational.Factorys.Abstract_Factory.Example.Products.Pizzas.Margarita.ChicagoMargarita;
import Creational.Factorys.Abstract_Factory.Example.Products.Pizzas.Margarita.Margarita;
import Creational.Factorys.Abstract_Factory.Example.Products.Pizzas.Neapolitan.ChicagoNeapolitan;
import Creational.Factorys.Abstract_Factory.Example.Products.Pizzas.Neapolitan.Neapolitan;

public class ChicagoPizzaFactory implements PizzaFactory {

  @Override
  public Neapolitan makeNeapolitan() {

    // create new specific Neapolitan

    return new ChicagoNeapolitan();
  }

  @Override
  public Margarita makeMargarita() {

    // create new specific Margarita

    return new ChicagoMargarita();
  }

}
