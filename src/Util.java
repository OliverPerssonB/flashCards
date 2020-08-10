package src;

import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Util {
  final private static String separator = " @ ";

  static List<Pair<String, String>> loadData() {
    List<Pair<String, String>> cardData = new ArrayList<>();
    try {
      File file = new File("/home/boggie/prg/flashCards/resources/industriellEkonomi.txt");
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] pair = line.split(separator);
        cardData.add(new Pair(pair[0], pair[1]));
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    return cardData;
  }

  static void printValues(List<Pair<String, String>> cardData) {
    for (Pair<String, String> pair : cardData) {
      System.out.println(pair.first + " : " + pair.second);
    }
  }
}
