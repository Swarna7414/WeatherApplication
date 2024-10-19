package Weather.application.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Current {
    @JsonProperty("temp_c")
    private double tempc;
    @JsonProperty("is_day")
    private int isday;
    private Condition condition;
    private int humidity;
    private int cloud;
    @JsonProperty("heatindex_c")
    private double heatindexc;
    @JsonProperty("dewpoint_c")
    private double dewpointc;
    @JsonProperty("gust_kph")
    private double gust_kph;

    public Current() {
    }

    public Current(double tempc, int isday, Condition condition, int humidity, int cloud, double heatindexc, double dewpointc, double gust_kph) {
        this.tempc = tempc;
        this.isday = isday;
        this.condition = condition;
        this.humidity = humidity;
        this.cloud = cloud;
        this.heatindexc = heatindexc;
        this.dewpointc = dewpointc;
        this.gust_kph = gust_kph;
    }

    public double gettempc() {
        return tempc;
    }

    public void settempc(double tempc) {
        this.tempc = tempc;
    }

    public int getisday() {
        return isday;
    }

    public void setisday(int isday) {
        this.isday = isday;
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

    public double getheatindexc() {
        return heatindexc;
    }

    public void setheatindexc(double heatindexc) {
        this.heatindexc = heatindexc;
    }

    public double getdewpointc() {
        return dewpointc;
    }

    public void setdewpointc(double dewpointc) {
        this.dewpointc = dewpointc;
    }

    public double getGust_kph() {
        return gust_kph;
    }

    public void setGust_kph(double gust_kph) {
        this.gust_kph = gust_kph;
    }
}
