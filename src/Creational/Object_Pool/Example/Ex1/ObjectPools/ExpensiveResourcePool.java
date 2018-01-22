package Creational.Object_Pool.Example.Ex1.ObjectPools;

import Creational.Object_Pool.Example.Ex1.Obj.ExpensiveResource;

public class ExpensiveResourcePool extends ObjectPool<ExpensiveResource> {

  static int i = 0;

  @Override
  protected ExpensiveResource create() {
    i++;
    return new ExpensiveResource(String.valueOf(i));
  }
}
