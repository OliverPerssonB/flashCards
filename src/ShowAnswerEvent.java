package src;

import javafx.event.Event;
import javafx.event.EventHandler;

public class ShowAnswerEvent implements EventHandler {

  @Override
  public void handle(Event event) {
    System.out.println("Working with show answer ...");
  }
}
