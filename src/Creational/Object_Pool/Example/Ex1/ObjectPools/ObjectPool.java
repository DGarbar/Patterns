package Creational.Object_Pool.Example.Ex1.ObjectPools;

import java.util.HashSet;
import java.util.Set;

public abstract class ObjectPool<T> {

  private Set<T> available = new HashSet<>();
  private Set<T> unavailable = new HashSet<>();

  protected abstract T create();

  /**
   * Checkout object from pool
   */
  public synchronized T getObj() {
    if (available.isEmpty()) {
      available.add(create());
    }
    T inst = available.iterator().next();
    available.remove(inst);
    unavailable.add(inst);
    return inst;
  }

  public synchronized void release(T inst) {
    available.add(inst);
    unavailable.remove(inst);
  }

  @Override
  public String toString() {
    return "Pool available = " + available.size() +
      "\n unavailable = " + unavailable.size();
  }
}
