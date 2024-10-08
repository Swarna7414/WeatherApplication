package Weather.application.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
    private String name;
    private String region;
    private String country;
    private double lat;
    private double lon;
    @JsonProperty("tzid")
    private String tzid;
    @JsonProperty("localtimeepoch")
    private long localtimeepoch;
    private String localtime;

    public Location() {
    }

    public Location(String name, String region, String country, double lat, double lon, String tzid, long localtimeepoch, String localtime) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.lat = lat;
        this.lon = lon;
        this.tzid = tzid;
        this.localtimeepoch = localtimeepoch;
        this.localtime = localtime;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String gettzid() {
        return tzid;
    }

    public void settzid(String tzid) {
        this.tzid = tzid;
    }

    public long getlocaltimeepoch() {
        return localtimeepoch;
    }

    public void setlocaltimeepoch(long localtimeepoch) {
        this.localtimeepoch = localtimeepoch;
    }

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }
}