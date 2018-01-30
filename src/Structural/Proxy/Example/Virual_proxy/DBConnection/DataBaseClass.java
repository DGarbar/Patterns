package Structural.Proxy.Example.Virual_proxy.DBConnection;

public class DataBaseClass implements DataBase {

  private boolean connection = false;
  private String type = "MySQL";

  //We use connect() when we create new class.
  public DataBaseClass() {
    connect();
  }

  @Override
  public void connect() {

    //Some hard work, which need a lot of time.
    //Sometimes, can be never used.
    try {
      //Mock process
      Thread.sleep(2000);
      System.out.println("Data base was connected");
      connection = true;
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }


  public String getType() {
    return type;
  }

  public boolean isConnection() {
    return connection;
  }
}
