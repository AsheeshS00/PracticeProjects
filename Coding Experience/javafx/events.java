import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class events extends Application implements EventHandler<ActionEvent>{
	
	Button butt;
	
	public static void main(String args[]){
		launch(args); 
	}
	
	
	@Override
	public void start(Stage stage){
		
		stage.setTitle("Hello unknown person");
		
		butt = new Button();
		butt.setText("Click me"); 
		
		
		butt.setOnAction(this); 
		
		/*
		*	Yout can also do
		*	butt.setOnAction(new EventHandler<ActionEvent>(){
			
			@Override
			public void handle(ActionEvent event){
				System.out.println("...");  
			}
			
		});
		
		
		
		
		or 
		
		
			butt.setOnAction(e -> {
				System.out.println("..."); 
			});
		
		**/
		
		StackPane lay = new StackPane();
		lay.getChildren().add(butt);
		
		
		Scene scene = new Scene(lay, 900, 700);
		stage.setScene(scene);
		stage.show(); 
		
	}
	
	
	@Override
	public void handle(ActionEvent event){
		
		if(event.getSource() == butt){
			System.out.println("Do not click me again!"); 
		}
		
	}
	
	
	
	
	
	
	
	
}






