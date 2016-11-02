import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class FontDemo extends Application{
  @Override
  public void start(Stage primaryStage){
    //Create a pane to hold the circle
    Pane pane = new StackPane();

    //Create a circle and set its properities
    Circle circle = new Circle();
    circle.setRadius(50);
    circle.setStroke(Color.BLACK);
    circle.setFill(new Color(0.5, 0.5, 0.5, 0.1));
    pane.getChildren().add(circle);

    //Create a label and set its properities
    Label label = new Label("JavaFx");
    label.setFont(Font.font("Times New Roman",
        FontWeight.BOLD, FontPosture.ITALIC, 20));
    pane.getChildren().add(label);
    //Line 21 and 27 can be combined as
    //pane.getChildren().addAll(circle, label);

    //Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("FontDemo");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
