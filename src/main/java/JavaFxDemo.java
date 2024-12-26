import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFxDemo extends Application{
	public static void main(String args[])
	{
		Application.launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage stage=new Stage();
		
		stage.setTitle("First Window");
		stage.setFullScreen(true);
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		
		Group actorgroup=new Group();
		
		Scene scene=new Scene(actorgroup, Color.BLUE);
		
		stage.setScene(scene);
		stage.show();
		
	}
}
