package Weather.application.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Day {
    @JsonProperty("maxtemp_c")
    private double maxtempc;
    @JsonProperty("mintemp_c")
    private double mintempc;
    @JsonProperty("avgtemp_c")
    private double avgtempc;
    private int avghumidity;

    public Day() {
    }

    public Day(double maxtempc, double mintempc, double avgtempc, int avghumidity) {
        this.maxtempc = maxtempc;
        this.mintempc = mintempc;
        this.avgtempc = avgtempc;
        this.avghumidity = avghumidity;
    }

    public double getmaxtempc() {
        return maxtempc;
    }

    public void setmaxtempc(double maxtempc) {
        this.maxtempc = maxtempc;
    }

    public double getmintempc() {
        return mintempc;
    }

    public void setmintempc(double mintempc) {
        this.mintempc = mintempc;
    }

    public double getavgtempc() {
        return avgtempc;
    }

    public void setavgtempc(double avgtempc) {
        this.avgtempc = avgtempc;
    }

    public int getAvghumidity() {
        return avghumidity;
    }

    public void setAvghumidity(int avghumidity) {
        this.avghumidity = avghumidity;
    }
}
