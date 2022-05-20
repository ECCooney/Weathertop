package models;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.Logger;
import play.db.jpa.Model;
import utils.MinMaxReadings;
import utils.ReadingConversions;
import utils.Trends;

@Entity

public class Station extends Model {
    public String name;
    public double latitude;
    public double longitude;

    @OneToMany(cascade = CascadeType.ALL)
    public List<Reading> readings = new ArrayList<>();

    public Reading newestReading() {
        Reading newestReading = null;
        if (readings.size() > 0) {
            newestReading = readings.get(readings.size() - 1);
        }
        return newestReading;
    }

    public Station(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double shortLat(){ return ReadingConversions.shortLat(latitude);}
    public double shortLong(){ return ReadingConversions.shortLong(longitude);}

    public String getName(){
        return name;
    }

    //methods for returning max and min values
    public Reading maxTemps(){return MinMaxReadings.getMaxTemp(readings);}
    public Reading minTemps(){return MinMaxReadings.getMinTemp(readings);}
    public Reading maxWinds(){return MinMaxReadings.getMaxWind(readings);}
    public Reading minWinds(){return MinMaxReadings.getMinWind(readings);}
    public Reading maxPressures(){return MinMaxReadings.getMaxPressure(readings);}
    public Reading minPressures(){return MinMaxReadings.getMinPressure(readings);}

    //return trends
    public String temperatureTrends(){return Trends.tempTrends(readings);}
    public String windSpeedTrends(){return Trends.windTrends(readings);}
    public String pressureTrends(){return Trends.pressureTrends(readings);}

}


