import javafx.application.Application;
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

public class customers extends Application {

 public void start(Stage stage) {
 
    Text text1 = new Text("Name: ");
     TextField textfield1 = new TextField ();
   
    Text text2 = new Text("Phone: ");
    TextField textfield2 = new TextField ();
    
	 Text text3 = new Text("Email: ");
	 TextField textfield3 = new TextField ();
	 Button btn1 = new Button("Save Customer");
	
	 Text text4 = new Text("Registered: ");
	 ComboBox combobox1 = new ComboBox();
     Button btn2 = new Button("Remove Customer");
	 
	 GridPane gridpane = new GridPane();
	 
	 gridpane.setMinSize(600, 400);
       
       
       gridpane.setPadding(new Insets(10,10,10,10));
       
       gridpane.setVgap(10);
       gridpane.setHgap(10);
       
       gridpane.setAlignment(Pos.CENTER);
       
	   gridpane.add(text1, 0, 0);
       gridpane.add(textfield1, 2, 0);
	   
	   gridpane.add(text2, 0, 2);
	   gridpane.add(textfield2, 2, 2);
	   
	   
	   gridpane.add(text3, 0, 4);
	   gridpane.add(textfield3, 2, 4);
	   gridpane.add(btn1, 2, 5);
	   
	   gridpane.add(text4, 0, 6);
	   gridpane.add(combobox1, 2, 6);
	   gridpane.add(btn2, 2, 7);
	   
	   Scene scene = new Scene(gridpane);
        
      
        
        stage.setTitle("");
        
        stage.setScene(scene);
        
        stage.show();
    }
 
 public static void main (String[] args) {
        launch(args);
 }
	   
	   
	   
            
 }
