import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFx extends Application {
  @Override
  //Override the start method in the Application
  public void start(Stage primaryStage){
    //Create a scene and place button in the scene
    Button btOK = new Button("OK");
    //Set the scene window size and button
    //Scene constructure: Scene(node, width, height)
    Scene scene = new Scene(btOK, 250, 350);
    //Set the title of scene
    primaryStage.setTitle("MyJavaFx");
    //Place the scene in the stage
    primaryStage.setScene(scene);
    //Display the stage
    primaryStage.show();
  }
  /**
   Main method is only needed for the IDE with limited JavaFx support.
   Not needed for running from the command line.
   public static void main(String[] args){
   Application.launch(args);
   launch method is a static method for launching a stand-alone JavaFx application.
   */
 }
}
