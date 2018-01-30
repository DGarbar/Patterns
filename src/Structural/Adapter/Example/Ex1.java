package Structural.Adapter.Example;

import Structural.Adapter.Example.Adapter.MyIterator;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 * We want replace our old Enumeration on more new Iterator
 */
public class Ex1 {

  public static void main(String[] args) {
    Vector<String> vector = new Vector<>(Arrays.asList("A", "B", "C", "D"));

    Enumeration enumeration = vector.elements();
    /*
     * elements() return Enumeration so we need to use Adapter
     * Also we can use (Iterator) vector.elements()
     */

    //Create Interface
    Iterator iterator = new MyIterator(enumeration);
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    //Get Exception
    iterator.remove();
  }
}
