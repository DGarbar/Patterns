package Structural.Adapter.Example;

import Structural.Adapter.Example.Adapter.MyIterator;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*У нас есть Enumeration но мы хотим использовать Iterator
 *У Iterator не те методы в интерфейсе.
 * Решение: Создаем свой адаптер
 */
public class Ex1 {

  public static void main(String[] args) {
    Vector vector = new Vector<>();
    vector.addAll(Arrays.asList("A", "B", "C", "D"));

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
