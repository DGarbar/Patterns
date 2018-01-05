package Structural.Proxy.Example.Virual_proxy;

import Structural.Proxy.Example.Virual_proxy.DBConnection.DataBase;
import Structural.Proxy.Example.Virual_proxy.DBConnection.DataBaseProxy;

//For Lazy loading
public class Ex {

  public static void main(String[] args) throws InterruptedException {
    DataBase dataBaseCon = new DataBaseProxy();

    System.out.println("Not connect() when we create object");
    Thread.sleep(3000);
    dataBaseCon.connect();

    //Use connect after first connection
    dataBaseCon.connect();

  }

}
