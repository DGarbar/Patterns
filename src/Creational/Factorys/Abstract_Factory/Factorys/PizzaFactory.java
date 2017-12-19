package Creational.Factorys.Abstract_Factory.Factorys;

import Creational.Factorys.Abstract_Factory.Products.Pizzas.Margarita.Margarita;
import Creational.Factorys.Abstract_Factory.Products.Pizzas.Neapolitan.Neapolitan;

public interface PizzaFactory {

  Neapolitan makeNeapolitan();

  Margarita makeMargarita();
}
