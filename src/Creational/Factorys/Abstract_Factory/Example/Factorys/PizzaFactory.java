package Creational.Factorys.Abstract_Factory.Example.Factorys;

import Creational.Factorys.Abstract_Factory.Example.Products.Pizzas.Margarita.Margarita;
import Creational.Factorys.Abstract_Factory.Example.Products.Pizzas.Neapolitan.Neapolitan;

public interface PizzaFactory {

  Neapolitan makeNeapolitan();

  Margarita makeMargarita();
}
