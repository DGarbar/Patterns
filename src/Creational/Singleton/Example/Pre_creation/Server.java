package Creational.Singleton.Example.Pre_creation;

//Thread save
public class Server {

  //Not Lazy loading

  private static Server ourInstance = new Server();

  public static Server getInstance() {
    return ourInstance;
  }

  private Server() {
  }
}
