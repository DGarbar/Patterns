package Creational.Singleton.Example.Simple;

//Not Thread save
public class Server {

  //Lazy loading

  private static Server server;

  public static Server getInstance() {
    if (server == null) {
      server = new Server();
    }
    return server;
  }

  private Server() {
  }
}
