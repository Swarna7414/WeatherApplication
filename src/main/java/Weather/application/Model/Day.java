package Weather.application.Model;

public class Day {
    private double maxtemp_c;
    private double mintemp_c;
    private double avgtemp_c;
    private int avghumidity;

    public Day() {
    }

    public Day(double maxtemp_c, double mintemp_c, double avgtemp_c, int avghumidity) {
        this.maxtemp_c = maxtemp_c;
        this.mintemp_c = mintemp_c;
        this.avgtemp_c = avgtemp_c;
        this.avghumidity = avghumidity;
    }

    public double getMaxtemp_c() {
        return maxtemp_c;
    }

    public void setMaxtemp_c(double maxtemp_c) {
        this.maxtemp_c = maxtemp_c;
    }

    public double getMintemp_c() {
        return mintemp_c;
    }

    public void setMintemp_c(double mintemp_c) {
        this.mintemp_c = mintemp_c;
    }

    public double getAvgtemp_c() {
        return avgtemp_c;
    }

    public void setAvgtemp_c(double avgtemp_c) {
        this.avgtemp_c = avgtemp_c;
    }

    public int getAvghumidity() {
        return avghumidity;
    }

    public void setAvghumidity(int avghumidity) {
        this.avghumidity = avghumidity;
    }
}
