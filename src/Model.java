package src;

import java.util.List;

class Model {
  private List<Pair<String, String>> cardData;
  private int index = 0;
  boolean isShown = false;
  // define an enum with states here, and a current state

  Model(List<Pair<String, String>> cardData) {
    this.cardData = cardData;
  }

  Pair<String, String> getNextPair() {
    Pair<String, String> res = cardData.get(index);
    index++;
    return res;
  }
}
