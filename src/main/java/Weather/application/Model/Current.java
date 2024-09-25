package Weather.application.Model;

public class Current {
    private double temp_c;
    private int is_day;
    private Condition condition;
    private int humidity;
    private int cloud;
    private double heatindex_c;
    private double dewpoint_c;
    private double gust_kph;

    public Current() {
    }

    public Current(double temp_c, int is_day, Condition condition, int humidity, int cloud, double heatindex_c, double dewpoint_c, double gust_kph) {
        this.temp_c = temp_c;
        this.is_day = is_day;
        this.condition = condition;
        this.humidity = humidity;
        this.cloud = cloud;
        this.heatindex_c = heatindex_c;
        this.dewpoint_c = dewpoint_c;
        this.gust_kph = gust_kph;
    }

    public double getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(double temp_c) {
        this.temp_c = temp_c;
    }

    public int getIs_day() {
        return is_day;
    }

    public void setIs_day(int is_day) {
        this.is_day = is_day;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    public double getHeatindex_c() {
        return heatindex_c;
    }

    public void setHeatindex_c(double heatindex_c) {
        this.heatindex_c = heatindex_c;
    }

    public double getDewpoint_c() {
        return dewpoint_c;
    }

    public void setDewpoint_c(double dewpoint_c) {
        this.dewpoint_c = dewpoint_c;
    }

    public double getGust_kph() {
        return gust_kph;
    }

    public void setGust_kph(double gust_kph) {
        this.gust_kph = gust_kph;
    }
}
