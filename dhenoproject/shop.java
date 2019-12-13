/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * <Title>Shopping website</Title>
 * <p>This is a shoping used for shopping products</p>
 * @version 1.0   
 * @author YCEE
 */

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
       
public class shop extends Application implements Hello{
//PreparedStatement pst;
     /**
     *
     * @param stage
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    @Override
public void start(Stage stage) {
 //make DB connection
 
         Text text1 = new Text("Product");
         Text text2 = new Text("Price");
         //Text text3 = new Text("Total");
     
       
       
         ComboBox cmbA =new ComboBox();
          ComboBox cmbB =new ComboBox();
           //Text textC = new Text();
         
       try {
          String driver = "com.mysql.jdbc.Driver";
          String database_url = "jdbc:mysql://localhost:3306/shop";
          String user = "root";
          String password = "";
          Class.forName(driver);
         
          Connection conn = (Connection) DriverManager.getConnection(database_url,user,password );
          Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("select * from tblproduct");
 
                while(rs.next()){
                   
       String product_name = rs.getString("Product_name");
       //String quantity = rs.getText();
       String price = rs.getString("price");
     
  cmbA.getItems().addAll(product_name);
  cmbB.getItems().addAll(price);
 
      //System.out.println("Fetched");
       
        }
       System.out.println("Fetched");}
        catch(Exception el){
            System.out.println("DB Failed!");
                }
       
        GridPane gridPaneA = new GridPane();
       
        gridPaneA.setMinSize(600,400);
       
        gridPaneA.setPadding(new Insets(15,15,15,15));
       
        gridPaneA.setVgap(10);
        gridPaneA.setHgap(10);
       
        gridPaneA.setAlignment(Pos.CENTER);
       
        gridPaneA.add(text1,0,0);
       gridPaneA.add(text2,0,4);
       // gridPaneA.add(text3,0,8);
       
     
        gridPaneA.add(cmbA,0,2);
        gridPaneA.add(cmbB,0,6);
      // gridPaneA.add(textC,0,10);
       
       
        text1.setStyle(" -fx-font: normal bold 20px 'serif'");
        text2.setStyle(" -fx-font: normal bold 20px 'serif'");
        //text3.setStyle(" -fx-font: normal bold 20px 'serif'");
       
      gridPaneA.setStyle("-fx-border-color: #000000;\n" +
                "    -fx-border-width: 2px;\n" +
                "    -fx-border-radius: 5px;\n" +
                "    -fx-border-insets: 5px;\n" +
                "    -fx-padding: 10px;\n" +
                "    -fx-spacing: 5px;\n" +
                "    -fx-background-image: url(image2.jpeg);\n" +
                "    -fx-background-insets: 5px;");
        Scene sceneA = new Scene(gridPaneA);
       
     
     Button btnB = new Button("Shop");
     gridPaneA.add(btnB,2,10);
     btnB.setStyle("-fx-background-color: #000000, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 12 30 12 30; -fx-text-fill: white; -fx-font-size: 12px;");
   
     btnB.setOnAction(ActionEvent-> {Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Cart");
                            alert.setHeaderText(null);
                            alert.setContentText(
                                            "Product: " + cmbA.getValue() +
                                            " \nPrice: " + cmbB.getValue());

                            alert.showAndWait();});
       

         stage.setTitle("DHENO SHOPPING");
         
         stage.setScene(sceneA);
         
         stage.show();
     
 
}  
      public void animation() {
        launch();
    }
} 
