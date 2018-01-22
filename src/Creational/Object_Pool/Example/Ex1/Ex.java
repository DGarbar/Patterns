package Creational.Object_Pool.Example.Ex1;

import Creational.Object_Pool.Example.Ex1.Obj.ExpensiveResource;
import Creational.Object_Pool.Example.Ex1.ObjectPools.ExpensiveResourcePool;

/*
Possible improvements
 - add variable pool size – increase to max size when needed;
 - add mechanism to clean the pool to min when the pool is idle;
 - clean the memory on shutdown;
 - keep the used objects in a separate container – in case that accidentally are not return the pool to be clean after a specific period of time. This will avoid the pool to be blocked;
 - keep alive mechanism – in case that objects need to be kept in a specific state. e.g. if the pooled objects are database connections to check from time to time if the connection is still open.
 - validation/clean mechanism for objects that become invalid.
*/

public class Ex {

  public static void main(String[] args) {
    ExpensiveResourcePool pool = new ExpensiveResourcePool();
    ExpensiveResource obj1 = pool.getObj();
    ExpensiveResource obj2 = pool.getObj();
    ExpensiveResource obj3 = pool.getObj();
    System.out.println(pool);
    pool.release(obj1);
    pool.release(obj2);
    System.out.println(pool);
    pool.getObj();
    System.out.println(pool);
  }
}
