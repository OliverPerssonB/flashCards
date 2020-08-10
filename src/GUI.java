package src;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;


public class GUI extends Application {
  private Model model;
  final private double hgap = 10.0;
  final private double vgap = 10.0;

  @Override
  public void init() {
    model = new Model(Util.loadData());
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    FlowPane fp = new FlowPane(hgap, vgap);
    ObservableList<Node> obsList = fp.getChildren();
    TextField word = new TextField("Word");
    TextField explanation = new TextField("Explanation");
    obsList.add(word);
    obsList.add(explanation);

    Button exit = new Button("Stop");
    exit.setCancelButton(true);
    exit.setOnAction(e -> Platform.exit());
    obsList.add(exit);

    Button show = new Button("Show");
    show.setCancelButton(true);
    show.setOnAction(e -> {
      System.out.println("Should show answer!");
    });
    obsList.add(exit);

    fp.setHgap(hgap);
    fp.setVgap(vgap);

    //Creating a Scene by passing the group object, height and width
    Scene scene = new Scene(fp ,900, 500);

    //setting color to the scene
    scene.setFill(Color.BLACK);

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

  private void setUpWord() {
    
  }

  public static void main(String[] args) {
    launch(args);
  }
}
