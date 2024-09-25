package Weather.application.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ForecastDay {
    private String date;
    @JsonProperty("dateepoch")
    private long dateepoch;
    private Day day;

    public ForecastDay() {
    }

    public ForecastDay(String date, long dateepoch, Day day) {
        this.date = date;
        this.dateepoch = dateepoch;
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getdateepoch() {
        return dateepoch;
    }

    public void setdateepoch(long dateepoch) {
        this.dateepoch = dateepoch;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}
