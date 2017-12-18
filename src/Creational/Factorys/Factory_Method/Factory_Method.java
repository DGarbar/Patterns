package Creational.Factorys.Factory_Method;

import Creational.Factorys.Factory_Method.Factorys.MargaritaFactory;
import Creational.Factorys.Factory_Method.Factorys.PizzaFactory;
import Creational.Factorys.Factory_Method.Products.Pizza;

public class Factory_Method {

  public static void main(String[] args) {

  /*
  We only need change one line
  Or we can do static create method
  But we create problem with inheritance and tests
  */

    PizzaFactory pizzaFactory = new MargaritaFactory();

    //do work

    Pizza pizza = pizzaFactory.orderPizza();

    //do work

    Pizza pizza2 = pizzaFactory.orderPizza();
    Pizza pizza3 = pizzaFactory.orderPizza();

  }
}