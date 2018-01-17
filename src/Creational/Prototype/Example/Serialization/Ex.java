package Creational.Prototype.Example.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    User u1 = new User("u1", 23);

    //Создание цепи потоков с потоком вывода объекта в конце
    ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("test1.dat"));
    ous.writeObject(u1);
    System.out.println(u1);
    ous.close();

    //Объекты считываются в том же порядке, в котором были записаны в файл.
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test1.dat"));
    User clone = (User) ois.readObject();
    System.out.println(clone);
    ois.close();
  }
}
