import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage; 



public class main extends Application{

	Button button;
	
	public static void main(String args[]){
		
		
		launch(args); // with this command, my program will be set up as a javafx application inside the extended Application class. 
		
	}


	@Override 
	public void start(Stage primaryStage) throws Exception{ 	// the entire window is the stage. The content inside your window or inside your stage is the scene. 
		primaryStage.setTitle("Title of the window."); 
		
		
		button = new Button();
		button.setText("Hello Asheesh");
		
		StackPane layout = new StackPane(); 
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene); 
		primaryStage.show(); 
		
		
	}
	
	
	
	
	


}




































































































