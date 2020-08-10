package src;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    List<Pair<String, String>> cardData = Util.loadData();
    Util.printValues(cardData);
  }
}
