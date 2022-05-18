package utils;

import models.Reading;
import models.Station;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxReadings {

 public static double getMaxTemp(Station station) {

    double maxT = 0;
    for (Reading reading : station.readings) {
      if (reading.temperature > maxT) {
        maxT = reading.temperature;
      }
    }
   return maxT;
 }

  public static double getMinTemp(Station stations) {
    double minT = 0;
    for (Reading reading : stations.readings) {
      if (reading.temperature < minT) {
        minT = reading.temperature;
      }
    }
    return minT;
  }

  public static double getMaxWind(Station station) {

    double maxW = 0;
    for (Reading reading : station.readings) {
      if (reading.windSpeed > maxW) {
        maxW = reading.windSpeed;
      }
    }
    return maxW;
  }

  public static double getMinWind(Station stations) {
    double minW = 0;
    for (Reading reading : stations.readings) {
      if (reading.windSpeed < minW) {
        minW = reading.windSpeed;
      }
    }
    return minW;
  }

  public static double getMaxPressure(Station station) {

    double maxP = 0;
    for (Reading reading : station.readings) {
      if (reading.pressure > maxP) {
        maxP = reading.pressure;
      }
    }
    return maxP;
  }

  public static double getMinPressure(Station stations) {
    double minP = 0;
    for (Reading reading : stations.readings) {
      if (reading.pressure < minP) {
        minP = reading.pressure;
      }
    }
    return minP;
  }

}
