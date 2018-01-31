package Creational.Object_Pool.Example.Ex2.ObjectPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class ObjectPool<T> implements Pool<T>, ObjFactory<T> {

  private int size;

  private boolean shutdown;

  private BlockingQueue<T> objects;

  public ObjectPool(int size) {
    this.size = size;
    shutdown = false;
    init();
  }

  /*
   * initiate the pool with fix size
   */
  private void init() {
    objects = new LinkedBlockingQueue<>();
    for (int i = 0; i < size; i++) {
      objects.add(createNew());
    }
  }

  @Override
  public T get() {
    if (!shutdown) {
      T t = null;

      try {
        t = objects.take();
      } catch (Exception e) {
        e.printStackTrace();
      }
      return t;
    }
    throw new IllegalStateException("Object pool is already shutdown.");
  }

  @Override
  public void release(T t) {
    try {
      objects.offer(t);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  //For simplicity of this example I only remove the objects from the pool.
  //In real life you might need to release the memory too. e.g.
  //if is a database connection pool, you need to close the connection before remove the object from the pool.
  @Override
  public void shutdown() {
    objects.clear();
  }

  public int size() {
    return objects.size();
  }

}

