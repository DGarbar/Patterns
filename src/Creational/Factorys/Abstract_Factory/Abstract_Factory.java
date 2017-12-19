package Creational.Factorys.Abstract_Factory;

import Creational.Factorys.Abstract_Factory.Factorys.ChicagoPizzaFactory;
import Creational.Factorys.Abstract_Factory.Factorys.NYPizzaFactory;
import Creational.Factorys.Abstract_Factory.Factorys.PizzaFactory;
import Creational.Factorys.Abstract_Factory.Products.Pizzas.Margarita.Margarita;
import Creational.Factorys.Abstract_Factory.Products.Pizzas.Neapolitan.Neapolitan;

public class Abstract_Factory {

  public static void main(String[] args) {
    PizzaFactory pizzaFactory = new ChicagoPizzaFactory();

    Margarita margarita = pizzaFactory.makeMargarita();
    Neapolitan neapolitan = pizzaFactory.makeNeapolitan();
    margarita.prepare();
    neapolitan.prepare();

    pizzaFactory = new NYPizzaFactory();

    margarita = pizzaFactory.makeMargarita();
    neapolitan = pizzaFactory.makeNeapolitan();
    margarita.prepare();
    neapolitan.prepare();


  }

}
