package Creational.Prototype.Example.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    User u1 = new User("u1", 23);

    //Create a thread chain with an object output stream at the end
    ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("test1.dat"));
    ous.writeObject(u1);
    System.out.println(u1);
    ous.close();

    //Objects are read in the same order in which they were written to the file
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test1.dat"));
    User clone = (User) ois.readObject();
    System.out.println(clone);
    ois.close();
  }
}
