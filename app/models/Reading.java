package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
import utils.ReadingConversions;

@Entity

public class Reading extends Model {
    public int code;
    public double temperature;
    public double windSpeed;
    public int pressure;

    public Reading(Long id, int code, double temperature, double windSpeed, int pressure) {
        this.code = code;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
    }

    public double getTempFaren(){
        return ReadingConversions.tempFaren(temperature);
        }

    public int getBeaufort(){
        return ReadingConversions.beaufort(windSpeed);
    }

    public String getConditions(){
        return ReadingConversions.weatherConditions(code);
        }


}

