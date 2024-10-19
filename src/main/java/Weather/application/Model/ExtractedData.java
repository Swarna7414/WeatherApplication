package Weather.application.Model;

public class ExtractedData {
    private String name;
    private String country;
    private String localdate;
    private String localtime;
    private String weather;
    private int humidity;
    private double tempc;
    private double heatindexc;
    private double dewpointc;
    private double gust_kph;

    public ExtractedData() {
    }

    public ExtractedData(String name, String country, String localdate, String localtime, String weather,Double tempc, int humidity, double heatindexc, double dewpointc, double gust_kph) {
        this.name = name;
        this.country = country;
        this.localdate=localdate;
        this.localtime = localtime;
        this.weather = weather;
        this.tempc=tempc;
        this.humidity = humidity;
        this.heatindexc = heatindexc;
        this.dewpointc = dewpointc;
        this.gust_kph = gust_kph;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocaldate() {
        return localdate;
    }

    public void setLocaldate(String localdate) {
        this.localdate = localdate;
    }

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public double getTempc() {
        return tempc;
    }

    public void setTempc(double tempc) {
        this.tempc = tempc;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getHeatindexc() {
        return heatindexc;
    }

    public void setHeatindexc(double heatindexc) {
        this.heatindexc = heatindexc;
    }

    public double getDewpointc() {
        return dewpointc;
    }

    public void setDewpointc(double dewpointc) {
        this.dewpointc = dewpointc;
    }

    public double getGust_kph() {
        return gust_kph;
    }

    public void setGust_kph(double gust_kph) {
        this.gust_kph = gust_kph;
    }

}
