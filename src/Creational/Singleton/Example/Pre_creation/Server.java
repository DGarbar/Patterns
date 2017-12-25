package Creational.Singleton.Example.Pre_creation;

public class Server {

  //Not Lazy loading
  private static Server ourInstance = new Server();

  //Thread save

  public static Server getInstance() {
    return ourInstance;
  }

  private Server() {
  }
}
