package utils;

import models.Reading;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinMaxReadings {

  public static Reading getMaxTemp(List<Reading> readings) {
    Reading maxTemp = null;
    if (readings.size() > 0) {
      maxTemp = Collections.max
          (readings, Comparator.comparing(reading -> reading.temperature));
    }
    return maxTemp;
  }

  public static Reading getMinTemp(List<Reading> readings){
    Reading minTemp = null;
    if (readings.size()>0) {
     minTemp = Collections.min
        (readings, Comparator.comparing(reading -> reading.temperature));
    }
    return minTemp;
  }

  public static Reading getMaxWind(List<Reading> readings){
    Reading maxWind = null;
    if (readings.size()>0) {
      maxWind = Collections.max
          (readings, Comparator.comparing(reading -> reading.windSpeed));
    }
    return maxWind;
  }

  public static Reading getMinWind(List<Reading> readings){
    Reading minWind = null;
    if (readings.size()>0) {
      minWind = Collections.min
          (readings, Comparator.comparing(reading -> reading.windSpeed));
    }
      return minWind;
  }

  public static Reading getMaxPressure(List<Reading> readings){
    Reading maxPressure = Collections.max
        (readings, Comparator.comparing(reading -> reading.pressure));
    return maxPressure;
  }

  public static Reading getMinPressure(List<Reading> readings){
    Reading minPressure = Collections.min
        (readings, Comparator.comparing(reading -> reading.pressure));
    return minPressure;
  }
}
