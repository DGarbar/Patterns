package Structural.Proxy.Example.Virual_proxy.DBConnection;

public class DataBaseProxy implements DataBase {

  private DataBaseClass dataBaseClass = null;

  //We can also send through constructor
  public DataBaseProxy(DataBaseClass dataBaseClass) {
    this.dataBaseClass = dataBaseClass;
  }

  //Or crate in Proxy
  public DataBaseProxy() {
    //dataBaseClass = new DataBaseClass();
  }


  @Override
  public void connect() {
    if (dataBaseClass == null) {

      //Create Only when we need to something from class
      //We can do something before or after some operation with object

      System.out.println("Please, wait... ");
      dataBaseClass = new DataBaseClass();
    }

    if (dataBaseClass.isConnection()) {
      System.out.println("Connection is successful");
    }
  }

  //Also use method
}
