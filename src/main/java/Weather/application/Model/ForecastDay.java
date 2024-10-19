package Weather.application.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ForecastDay {
    private String date;
    private Day day;

    public ForecastDay() {
    }

    public ForecastDay(String date,Day day) {
        this.date = date;
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}
