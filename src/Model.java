package src;

import java.util.List;

class Model {
  private List<Pair<String, String>> cardData;
  private int index = 0;

  Model(List<Pair<String, String>> cardData) {
    this.cardData = cardData;
  }

  Pair<String, String> getNextPair() {
    if (index < cardData.size()) {
      Pair<String, String> res = cardData.get(index);
      index++;
      return res;
    } else {
      throw new Exception("No more pairs and asked for more, should not occur")
    }
  }
}
