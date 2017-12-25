package Creational.Factorys.Abstract_Factory.Example;

import Creational.Factorys.Abstract_Factory.Example.Factorys.ChicagoPizzaFactory;
import Creational.Factorys.Abstract_Factory.Example.Factorys.NYPizzaFactory;
import Creational.Factorys.Abstract_Factory.Example.Factorys.PizzaFactory;
import Creational.Factorys.Abstract_Factory.Example.Products.Pizzas.Margarita.Margarita;
import Creational.Factorys.Abstract_Factory.Example.Products.Pizzas.Neapolitan.Neapolitan;

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
