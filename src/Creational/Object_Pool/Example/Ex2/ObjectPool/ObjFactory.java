package Creational.Object_Pool.Example.Ex2.ObjectPool;

public interface ObjFactory<T> {

  /**
   * Returns a new instance of an object type T.
   *
   * @return T an new instance of the object type T
   */
  T createNew();
}
