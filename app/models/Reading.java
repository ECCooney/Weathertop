package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
import utils.ReadingConversions;

import java.util.Date;

@Entity

public class Reading extends Model {
    public int code;
    public double temperature;
    public double windSpeed;
    public double windDirection;
    public double pressure;
    public Date date;


    public Reading(Date date, Long id, int code, double temperature, double windSpeed, double windDirection, double pressure) {
        this.code = code;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.pressure = pressure;
        this.date = date;
    }

    /*methods for calling reading conversion calculations in views*/

    public double getTempFaren(){ return ReadingConversions.tempFaren(temperature);}
    public int getBeaufort(){
        return ReadingConversions.beaufort(windSpeed);
    }
    public String getConditions(){
        return ReadingConversions.weatherConditions(code);
    }
    public String getIcons() {return ReadingConversions.weatherIcon(code);}
    public String getWindDirect() {
        return ReadingConversions.windDirect(windDirection);
    }
    public double getWindChill(){return ReadingConversions.windChill(temperature, windSpeed);}

}




