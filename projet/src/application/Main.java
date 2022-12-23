package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;    
import Entity.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
	//	launch(args);
LocalDateTime now = LocalDateTime.now();  
Client.init("files/client.txt");
Client.init_ecriture("files/client.txt");

int i;
try 
{
Client c=new Client("aziz","kouki",2);
Client c1=new Client("aziz2","koukie",23);
Client.ajouter(c);
Client.ajouter(c1);
Client.fo.close();
}
catch (IOException e) 
{}

try {
List<Client> cs=Client.consulter();
cs.forEach(System.out::println);
Client.modifier(new Client("aziz2","koukie",23));
Client.fo.close();

cs=Client.consulter();
System.out.println("modif");
cs.forEach(System.out::println);

Client.supprimer(new Client("aziz","kouki",2));
Client.fo.close();

cs=Client.consulter();
System.out.println("supprim");
cs.forEach(System.out::println);

} 
catch (IOException e) 
{}


	  
		     }
		 }

