package utils;

import models.Reading;

import java.util.List;

public class Trends {

  public static String tempTrends(List<Reading> readings) {
    String temTrends = null;
    if (readings.size() > 2) {
      Reading readingA = readings.get(readings.size() - 1);
      Reading readingB = readings.get(readings.size() - 2);
      Reading readingC = readings.get(readings.size() - 3);
      if (readingA.temperature > readingB.temperature &&
          readingB.temperature > readingC.temperature) {
        temTrends = "big arrow up icon";
      } else if ((readingA.temperature < readingB.temperature &&
          readingB.temperature < readingC.temperature)) {
        temTrends = "big arrow down icon";
      } else temTrends = "big exchange icon";
    }
    return temTrends;
  }

  public static String windTrends(List<Reading> readings) {
    String winTrends = null;
    if (readings.size() > 2) {
      Reading readingA = readings.get(readings.size() - 1);
      Reading readingB = readings.get(readings.size() - 2);
      Reading readingC = readings.get(readings.size() - 3);
      if (readingA.windSpeed > readingB.windSpeed &&
          readingB.windSpeed > readingC.windSpeed) {
        winTrends = "big arrow up icon";
      } else if ((readingA.windSpeed < readingB.windSpeed &&
          readingB.windSpeed < readingC.windSpeed)) {
        winTrends = "big arrow down icon";
      } else winTrends = "big exchange icon";
    }
    return winTrends;
  }

  public static String pressureTrends(List<Reading> readings) {
    String pressTrends = null;
    if (readings.size() > 2) {
      Reading readingA = readings.get(readings.size() - 1);
      Reading readingB = readings.get(readings.size() - 2);
      Reading readingC = readings.get(readings.size() - 3);
      if (readingA.pressure > readingB.pressure &&
          readingB.pressure > readingC.pressure) {
        pressTrends = "big arrow up icon";
      } else if ((readingA.pressure < readingB.pressure &&
          readingB.pressure < readingC.pressure)) {
        pressTrends = "big arrow down icon";
      } else pressTrends = "big exchange icon";
    }
    return pressTrends;
  }
}


