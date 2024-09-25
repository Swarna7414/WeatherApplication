package Weather.application.Model;

public class ForecastDay {
    private String date;
    private long date_epoch;
    private Day day;

    public ForecastDay() {
    }

    public ForecastDay(String date, long date_epoch, Day day) {
        this.date = date;
        this.date_epoch = date_epoch;
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getDate_epoch() {
        return date_epoch;
    }

    public void setDate_epoch(long date_epoch) {
        this.date_epoch = date_epoch;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}
