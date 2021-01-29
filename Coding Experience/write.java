import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox; 
import javafx.stage.Stage;


public class write extends Application{
	
	Stage window;
	Scene scene1, scene2;
	
	public static void main(String args[]){
		launch(args); 
	}
	
	@Override
	public void start(Stage stage){
		
		window = stage; 
		
		Label label = new Label("This is scene 1");
		Button button = new Button("Go to scene 2");
		button.setOnAction(e -> window.setScene(scene2));
		
		// Layout 1- children are laid our in vertical column.
		VBox layout1 = new VBox(20);
		
		layout1.getChildren().addAll(label, button);  
		
		scene1 = new Scene(layout1, 900, 700);
		
		
		
		// Button 2
		Button button2 = new Button("Go to scene 1");
		button2.setOnAction(e -> window.setScene(scene1));
		
		// Layout 2
		StackPane layout2 = new StackPane();
		layout2.getChildren().addAll(button2); 
		
		scene2 = new Scene(layout2, 900,700);
		
		window.setScene(scene1);   
		window.setTitle("Hello Human");
		window.show(); 
		
		
		
		
		
		
	}
	
	
}



















































