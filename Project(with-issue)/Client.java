/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */






import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHAKRA
 */
public class Client  {
    
    private Client (){
        
    }
    
    public static void main (String []args) throws NotBoundException{
        
        try {
            Registry registry = LocateRegistry.getRegistry(null);
            Project stub = (Project) registry.lookup("Project");
            stub.createConnection();
            //stub.fillCombo();
            //stub.fillCombo2();
            stub.insert();
        } catch (RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
