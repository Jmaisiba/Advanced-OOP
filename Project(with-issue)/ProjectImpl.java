


import javafx.application.Application;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;


public class ProjectImpl extends Application implements Project {
  
    
      
  

 Label label1 = new Label("Welcome to Digital Ordering");
 
  Text text1 = new Text("Write table No: ");
  TextField textfielda = new TextField ();
     
  
  Text text2 = new Text("Select food item: ");
   TextField textfieldb = new TextField (); 
    
    
    Text text3 = new Text("Extras: ");
        TextField textfield1 = new TextField ();
        
        Text text4 = new Text("Comments: ");
          TextArea textarea1 = new TextArea();
       
          Label label2=new Label("");
        
        Button btn = new Button("PLACE ORDER");
        
     Connection con=null; 
     Statement stmt=null;

     ResultSet rs=null;
        
        public void createConnection(){
            
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con =DriverManager.getConnection("jdbc:mysql://localhost/dbbooks?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Moscow", "root", "");
          System.err.println("Connected");
            
          
        } catch (SQLException | ClassNotFoundException ex) {
           
		    System.err.println("Unable Connected");
		   ex.printStackTrace();
        }
            
        }
        
  
        
        public void insert(){
            
         try {
      String sql="INSERT INTO `orders` (`table_no` , `food_order` , `extras` , `specials`) VALUES ('"+textfielda.getText()+"' , '"+textfieldb.getText()+"' , '"+textfield1.getText()+"' , '"+textarea1.getText()+"')";
      stmt.executeUpdate(sql);

             
             System.err.println("successfully inserted");
		  
            
             rs.close();
      con.close();
         } catch (SQLException ex) {
             System.err.println("Unsuccessful insertion");
		   ex.printStackTrace(); 
         }
          
        }
        
        
     
   
    @Override
    public void start(Stage stage) {
  createConnection();
  insert();

       GridPane gridpane = new GridPane();
      
        EventHandler<MouseEvent> eventHandler= new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
               insert();    
            }
        };
		
		
        
        btn.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        label1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 10));
       
        textfielda.setPromptText("Enter table number");
		textfieldb.setPromptText("Enter order");
		textfield1.setPromptText("Any food Extras");
        textarea1.setPromptText("Special request for you food");
        
       gridpane.setMinSize(600, 400);
       
       
       gridpane.setPadding(new Insets(10,10,10,10));
       
       gridpane.setVgap(10);
       gridpane.setHgap(10);
       
       gridpane.setAlignment(Pos.CENTER);
       
       gridpane.add(label1, 0 ,0);
       
       gridpane.add(text1, 0, 2);
       gridpane.add(textfielda, 1, 2);
       
       
       gridpane.add(text2, 0, 3);
       gridpane.add(textfieldb, 1, 3);
       
       gridpane.add(text3, 0, 4);
       gridpane.add(textfield1, 1, 4);
       
       gridpane.add(text4, 0, 5);
       gridpane.add(textarea1, 1, 5);
       
       gridpane.add(btn, 1, 7);
       
       gridpane.add(label2, 0, 8);
		
        Scene scene = new Scene(gridpane);
        
      
        
        stage.setTitle("Kushiba Kweli Hotel");
        
        stage.setScene(scene);
        
        stage.show();
    }
 
 
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
