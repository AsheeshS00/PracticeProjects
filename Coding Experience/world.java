import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox; 
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage; 



// Calculator
public class world extends Application{
	
	public static String num;
	String ll = "";
	
	
	
	static Button button1;
	static Button button2;
	static Button button3;
	static Button button4;
	static Button button5;
	static Button button6;
	static Button button7;
	static Button button8;
	static Button button9;
	static Button button0;
	static Button buttonD;
	static Button buttonM;
	static Button buttonA;
	static Button buttonS;
	static Button buttond;
	static Button buttondd;
	
	public static void main(String args[]){
		launch(args);
	}
	
	
	
	@Override
	public void start(Stage stuff){
		
		stuff.setTitle("Hello Human");
		
		Text text = new Text(200, 50, "");
		
		// Button to the calc
		button1 = new Button("1");
		button1.setOnAction(e -> {
			ll += "1";
		});
		//button1.setOnAction(e -> System.out.println("Get Lost!"));
		button2 = new Button("2");
		button2.setOnAction(e -> ll += "2");
		button3 = new Button("3");
		button3.setOnAction(e -> ll += "3");
		button4 = new Button("4");
		button4.setOnAction(e -> ll += "4");
		button5 = new Button("5");
		button5.setOnAction(e -> ll += "5");
		button6 = new Button("6");
		button6.setOnAction(e -> ll += "6");
		button7 = new Button("7");
		button7.setOnAction(e -> ll += "7");
		button8 = new Button("8");
		button8.setOnAction(e -> ll += "8");
		button9 = new Button("9");
		button9.setOnAction(e -> ll += "9");
		button0 = new Button("0");
		button0.setOnAction(e -> ll += "0");
		buttonD = new Button("/");
		buttonD.setOnAction(e -> ll += "/");
		buttonM = new Button("X");
		buttonM.setOnAction(e -> ll += "*");
		buttonA = new Button("+");
		buttonA.setOnAction(e -> ll += "+");
		buttonS = new Button("-");
		buttonS.setOnAction(e -> ll += "-");
		buttond = new Button(""); 
		buttondd = new Button("="); 
		buttondd.setOnAction(e -> {
			transformer(ll);
			text.setText(num);
			ll = "";
		});
		
	
		
		HBox st = new HBox(); 
		HBox vLayout1 = new HBox(15);
		HBox vLayout2 = new HBox(15);
		HBox vLayout3 = new HBox(15);
		HBox vLayout4 = new HBox(15);
		st.getChildren().add(text); 
		vLayout1.getChildren().addAll(button7, button8, button9, buttonM);
		vLayout2.getChildren().addAll(button4, button5, button6, buttonD);
		vLayout3.getChildren().addAll(button1, button2, button3, buttonA);
		vLayout4.getChildren().addAll(buttond, buttondd ,button0, buttonS);
		

		
		VBox cLayout = new VBox(15); 
		cLayout.getChildren().addAll(st, vLayout1, vLayout2, vLayout3, vLayout4); 
		
		Scene scene = new Scene(cLayout, 500, 400);
		stuff.setScene(scene); 
		stuff.show(); 
		
		
				
	}
	
	
	
	
		
		
		
		
		
	// for basic calculations
	public static void transformer(String str){
		
		int num1 = 0;
		int num2 = 0; 
		int n = 0;
		double answer = 0;
		
		
		for(int i = 0; i < str.length() -1; i++){
			
			if(str.substring(i, i+1).equals("+")){
				n = i; 
				num1 =  Integer.parseInt(str.substring(0, i));
				num2 = Integer.parseInt(str.substring(i+1));
				
				if(i == n){
					answer = (int) (num1 + num2);
				}
				
			}
			
		}
		 
	

		for(int i = 0; i < str.length() -1; i++){
			
			if(str.substring(i, i+1).equals("*")){
				n = i; 
				num1 =  Integer.parseInt(str.substring(0, i));
				num2 = Integer.parseInt(str.substring(i+1));
				
				if(i == n){
					answer = (int) (num1 * num2);
				}
				
			}
			
		}



		for(int i = 0; i < str.length() -1; i++){
			
			if(str.substring(i, i+1).equals("-")){
				n = i; 
				num1 =  Integer.parseInt(str.substring(0, i));
				num2 = Integer.parseInt(str.substring(i+1));
				
				if(i == n){
					answer = (int) (num1 - num2);
				}
				
			}
			
		}


		for(int i = 0; i < str.length() -1; i++){
			
			if(str.substring(i, i+1).equals("/")){
				n = i; 
				num1 =  Integer.parseInt(str.substring(0, i));
				num2 = Integer.parseInt(str.substring(i+1));
				
				if(i == n){
					answer = (int) (num1 / num2);
				}
				
			}
			
		}

	
		num = Double.toString(answer); 
		
	}
	
	
	
	
	
	
}





































