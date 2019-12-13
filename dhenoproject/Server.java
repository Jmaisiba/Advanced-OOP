import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends shop{	
    public Server() {}
    public static void main(String args[]){
       try {
           /**
  *
  *instatiating the implimentation class
  */
          shop obj= new shop();
           /**
  *
  *exporting the object of implentation class
  */
           /**
  *
  *here we are exporting the remote object to the stub
  */
           Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);
           
           /**
  *
  *Binding the remote object (stub) in the registry
  */
           Registry registry = LocateRegistry.getRegistry();
           
           registry.rebind("Hello", stub);
           System.err.println("Server ready");
      } catch (Exception e) {
      System.err.println("Server exception: " + e.toString());
      e.printStackTrace();
      }
   
}
}

