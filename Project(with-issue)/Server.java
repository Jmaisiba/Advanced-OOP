/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author CHAKRA
 */
public class Server extends ProjectImpl {
    
    public Server (){
        
    }
    
    public static void main (String [] args) {
     
        try {
            ProjectImpl javafx= new ProjectImpl();
            
            Project stub = (Project) UnicastRemoteObject.exportObject(javafx, 0);
            Registry registry = LocateRegistry.getRegistry();
          
                registry.bind("Project", stub);
                 System.err.println("Server is running");
            
          
            
        } catch (RemoteException | AlreadyBoundException ex) {
             
           System.err.println("Server is not running");
           ex.printStackTrace();
		   
        }
        
        
        
    }
    
    
}
