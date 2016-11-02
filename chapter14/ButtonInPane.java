import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class ButtonInPane extends Application{
  @Override
  public void start(Stage primaryStage){
    //Create a scene and place a button in the scene
    StackPane pane = new StackPane();
    pane.getChildren().add(new Button("OK"));
    Scene scene = new Scene(pane, 200, 50);
    //set the stage title
    primaryStage.setTitle("Button in a pane");
    //Place the scene in the stage
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
