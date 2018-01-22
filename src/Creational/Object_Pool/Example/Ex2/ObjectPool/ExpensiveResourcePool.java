package Creational.Object_Pool.Example.Ex2.ObjectPool;

import Creational.Object_Pool.Example.Ex2.Obj.ExpensiveResource;
import java.util.UUID;

public class ExpensiveResourcePool extends ObjectPool<ExpensiveResource> {

  public ExpensiveResourcePool(int size) {
    super(size);
  }

  @Override
  public ExpensiveResource createNew() {
    //return an object with random name
    return new ExpensiveResource(UUID.randomUUID().toString());
  }
}
