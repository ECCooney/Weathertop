package utils;

import models.Reading;

public class ReadingConversions{

    public static double tempFaren(double temperature) {
        temperature = ((temperature * 9 / 5) + 32);
        return temperature;
    }

    public static String weatherConditions(int code) {
        String conditions = null;
        switch (code) {
            case 100:
                conditions = "Clear";
                break;
            case 200:
                conditions = "Partial Clouds";
                break;
            case 300:
                conditions = "Cloudy";
                break;
            case 400:
                conditions = "Light Showers";
                break;
            case 500:
                conditions = "Heavy Showers";
                break;
            case 600:
                conditions = "Rain";
                break;
            case 700:
                conditions = "Snow";
                break;
            case 800:
                conditions = "Thunder";
                break;
            case 0:
                conditions = "No Current Reading";
                break;
        }
        return conditions;
    }

    public static int beaufort(double windSpeed){
        int beauf = 0;

        if (windSpeed <= 1){
            beauf = 0;
        }
        else if (windSpeed > 1 && windSpeed <= 5){
            beauf = 1;
        }
        else if (windSpeed > 5 && windSpeed <= 11){
            beauf = 2;
        }
        else if (windSpeed > 11 && windSpeed <= 19){
            beauf = 3;
        }
        else if (windSpeed > 19 && windSpeed <= 28){
            beauf = 4;
        }
        else if (windSpeed > 28 && windSpeed <= 38){
            beauf = 5;
        }
        else if (windSpeed > 38 && windSpeed <= 49){
            beauf = 6;
        }
        else if (windSpeed > 49 && windSpeed <= 61){
            beauf = 7;
        }
        else if (windSpeed > 61 && windSpeed <= 74){
            beauf = 8;
        }
        else if (windSpeed > 74 && windSpeed <= 88){
            beauf = 9;
        }
        else if (windSpeed > 88 && windSpeed <= 102){
            beauf = 10;
        }
        else if (windSpeed > 102 && windSpeed <= 117){
            beauf = 11;
        }

        return beauf;
    }
}
