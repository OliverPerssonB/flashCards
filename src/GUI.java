package src;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;

public class GUI extends Application {
  private Util util;
  private Model model;
  final private double hgap = 10.0;
  final private double vgap = 10.0;

  @Override
  public void init() {
    util = new Util();
    model = new Model(util.loadData());
  }

  @Override
  public void start(Stage primaryStage) throws Exception {

    FlowPane fp = new FlowPane(hgap, vgap);
    //creating a Group object
    ObservableList<Node> obsList = fp.getChildren();

    for (int i = 1; i < 6; i++) {
      Label l = new Label("Label #" + i);
      obsList.add(l);
    }

    //Creating a Scene by passing the group object, height and width
    Scene scene = new Scene(fp ,900, 500);

    //setting color to the scene
    scene.setFill(Color.BLUE);

    //Setting the title to Stage.
    primaryStage.setTitle("Flash Cards");

    //Adding the scene to Stage
    primaryStage.setScene(scene);

    //Displaying the contents of the stage
    primaryStage.show();
  }

  @Override
  public void stop() throws Exception {
    System.out.println("Something went wrong, not doing anything in stop method yet.");
  }

  public static void main(String[] args) {
    launch(args);
  }
}
