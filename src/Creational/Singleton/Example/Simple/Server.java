package Creational.Singleton.Example.Simple;

public class Server {

  //Lazy loading

  private static Server server;

  private Server() {
  }

  //Not Thread save

  public static Server getInstance() {
    if (server == null) {
      server = new Server();
    }
    return server;
  }

}
