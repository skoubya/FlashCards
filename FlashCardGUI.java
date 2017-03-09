import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;
import javafx.geometry.HPos;
import javafx.geometry.Pos;

 
public class FlashCardGUI extends Application {
	private Stage primaryStage;
	private GridPane grid = new GridPane();
	private FlashCards deck;
	private Text words;
	private Button front1st;
	private Button back1st;
	private Button listAll;
	private Button numLeft;
	private Button quit;
	private Button mainMenu;
	private Button keepCard;
	private Button removeCard;
	private Button showFront;
	private Button showBack;
	
	private void createButtons(){
		front1st = new Button();
		front1st.setText("View front first");
		front1st.setOnAction(new EventHandler<ActionEvent>() {
 
			@Override
			public void handle(ActionEvent event) {
				showFront1stMenu();
				words.setText(deck.getFront());
			}
		});
		
		back1st = new Button();
		back1st.setText("View back first");
		back1st.setOnAction(new EventHandler<ActionEvent>() {
 
			@Override
			public void handle(ActionEvent event) {
				showBack1stMenu();
				words.setText(deck.getBack());
			}
		});
		
		listAll = new Button();
		listAll.setText("List all");
		listAll.setOnAction(new EventHandler<ActionEvent>() {
 
			@Override
			public void handle(ActionEvent event) {
				words.setText("Not yet"); //TODO: actually do
			}
		});
		
		numLeft = new Button();
		numLeft.setText("Number of cards left");
		numLeft.setOnAction(new EventHandler<ActionEvent>() {
 
			@Override
			public void handle(ActionEvent event) {
				words.setText(Integer.toString(deck.getNumLeft())+" cards left");
			}
		});
		
		quit = new Button();
		quit.setText("Quit");
		quit.setOnAction(new EventHandler<ActionEvent>() {
 
			@Override
			public void handle(ActionEvent event) {
				primaryStage.close();
			}
		});
		
		mainMenu = new Button();
		mainMenu.setText("Main Menu");
		mainMenu.setOnAction(new EventHandler<ActionEvent>() {
 
			@Override
			public void handle(ActionEvent event) {
				deck.getNewCard();
				showMainMenu();
			}
		});
		
		keepCard = new Button();
		keepCard.setText("Keep in deck");
		keepCard.setOnAction(new EventHandler<ActionEvent>() {
 
			@Override
			public void handle(ActionEvent event) {
				deck.getNewCard();
				showMainMenu();
			}
		});
		
		removeCard = new Button();
		removeCard.setText("Remove from deck");
		removeCard.setOnAction(new EventHandler<ActionEvent>() {
 
			@Override
			public void handle(ActionEvent event) {
				deck.cardCorrect();
				deck.getNewCard();
				showMainMenu();
			}
		});
		
		showFront = new Button();
		showFront.setText("View Front");
		showFront.setOnAction(new EventHandler<ActionEvent>() {
 
			@Override
			public void handle(ActionEvent event) {
				showKeepMenu();
				words.setText(deck.getFront());
				grid.add(showBack,0,2,2,1);
				grid.setHalignment(showBack, HPos.CENTER);
			}
		});
		
		showBack = new Button();
		showBack.setText("View Back");
		showBack.setOnAction(new EventHandler<ActionEvent>() {
 
			@Override
			public void handle(ActionEvent event) {
				showKeepMenu();
				words.setText(deck.getBack());
				grid.add(showFront,0,2,2,1);
				grid.setHalignment(showFront, HPos.CENTER);
			}
		});
		
		front1st.setMinWidth(170);
		back1st.setMinWidth(170);
		listAll.setMinWidth(170);
		numLeft.setMinWidth(170);
		quit.setMinWidth(170);
		mainMenu.setMinWidth(170);
		keepCard.setMinWidth(170);
		removeCard.setMinWidth(170);
		showFront.setMinWidth(170);
		showBack.setMinWidth(170);
	}
	
	private void showMainMenu(){
		words.setText("");
		grid.getChildren().clear();
		
		grid.add(words, 0, 0, 2, 1); //column 0, row 0, colspan 2, rowspan 1
		grid.add(front1st,0,1);
		grid.add(back1st,1,1);
		grid.add(listAll,0,2);
		grid.add(numLeft,1,2);
		grid.add(quit,0,3,2,1);
		
		grid.setHalignment(words, HPos.CENTER);
		grid.setHalignment(quit, HPos.CENTER);
		//grid.setGridLinesVisible(true);
	}
	
	private void showFront1stMenu(){
		words.setText("");
		grid.getChildren().clear();
		
		grid.add(words, 0, 0, 2, 1); //column 0, row 0, colspan 2, rowspan 1
		grid.add(showBack,0,1,1,1);
		grid.add(mainMenu,1,1,1,1);
		
		grid.setHalignment(words, HPos.CENTER);
		//grid.setGridLinesVisible(true);
	}
	
	private void showBack1stMenu(){
		words.setText("");
		grid.getChildren().clear();
		
		grid.add(words, 0, 0, 2, 1); //column 0, row 0, colspan 2, rowspan 1
		grid.add(showFront,0,1,1,1);
		grid.add(mainMenu,1,1,1,1);
		
		grid.setHalignment(words, HPos.CENTER);
		//grid.setGridLinesVisible(true);
	}
	
	private void showKeepMenu(){
		words.setText("");
		grid.getChildren().clear();
		
		grid.add(words, 0, 0, 2, 1); //column 0, row 0, colspan 2, rowspan 1
		grid.add(removeCard,0,1,1,1);
		grid.add(keepCard,1,1,1,1);
		
		grid.setHalignment(words, HPos.CENTER);
		//grid.setGridLinesVisible(true);
	}
	
	@Override
	public void start(Stage pStage) {		
		primaryStage = pStage;
		StackPane root = new StackPane();
		grid.setAlignment(Pos.CENTER);
		//grid.setGridLinesVisible(true);

		words = new Text();
		
		//select a file
		// TODO: Move to own function (ativated by a button)
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Flashcard Deck");
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("Flashcard Files (*.vcb)", "*.vcb"),
				new ExtensionFilter("All Files", "*.*")); //TODO: maybe remove (don't want any type of file)
		File deckFile = fileChooser.showOpenDialog(primaryStage);
		
		//TODO: make more robust
		if(deckFile == null){
			System.err.println("Should have put a file");
			return;
		}
		
		try{
			deck = new FlashCards (new FileReader(deckFile));
			deck.getNewCard();
		}
		catch (FileNotFoundException e){
			System.err.println(e.toString());
			return;
		}
		
		createButtons();		
		showMainMenu();
		
		root.getChildren().add(grid);
		
		Scene scene = new Scene(root, 400, 250);

		primaryStage.setTitle("Flash Cards");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}