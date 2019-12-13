

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Project extends Remote{
    
      public void createConnection() throws RemoteException;
      // public void fillCombo() throws RemoteException;
      // public void fillCombo2() throws RemoteException;
       public void insert() throws RemoteException;
      
    
}
