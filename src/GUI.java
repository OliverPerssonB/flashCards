package src;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;

import java.awt.*;


public class GUI extends Application {
  private Model model;
  boolean isShown = false;
  final private double hgap = 10.0;
  final private double vgap = 10.0;

  @Override
  public void init() {
    model = new Model(Util.loadData());
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    // Group
    FlowPane fp = new FlowPane(hgap, vgap);
    fp.setPadding(new Insets(10,10,10,10));
    fp.setAlignment(Pos.CENTER);
    fp.setHgap(hgap);
    fp.setVgap(vgap);
    fp.setStyle("-fx-background-color: DIMGRAY;" +
      "-fx-padding: 10px;");
    ObservableList<Node> obsList = fp.getChildren();

    Pair<String, String> currentPair = model.getNextPair();

    TextField word = new TextField(currentPair.first);
    word.setPrefSize(100, 100);
    word.setFont(new Font(15));

    TextArea explanation = new TextArea("?");
    explanation.setPrefSize(400, 400);
    explanation.setWrapText(true);
    explanation.setFont(new Font(30));
    explanation.setStyle("-fx-font-alignment: center;");

    obsList.add(word);
    obsList.add(explanation);

    Button show = new Button("Show");
    show.setOnAction(e1 -> {
        explanation.setText(currentPair.second);
        Button next = new Button("next?");
        obsList.add(next);
    });
    obsList.add(show);

    Button exit = new Button("Stop");
    exit.setCancelButton(true);
    exit.setOnAction(e -> Platform.exit());
    obsList.add(exit);

    //Creating a Scene by passing the group object, height and width
    Scene scene = new Scene(fp ,900, 500);

    //setting color to the scene

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
