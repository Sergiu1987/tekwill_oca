package report;

public class Report {
    private String date;
    private String country;
    private String location;
    private String event;
    private String extra;


    @Override
    public String toString() {
        return " | " +
                " |" + date + '\'' +
                ", country='" + country + '\'' +
                ", location='" + location + '\'' +
                ", event='" + event + '\'' +
                ", extra='" + extra + '\'' +
                "}\n";
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getDate() {

        return date;
    }

    public String getCountry() {
        return country;
    }

    public String getLocation() {
        return location;
    }

    public String getEvent() {
        return event;
    }

    public String getExtra() {
        return extra;
    }



    public Report(String date, String country, String location, String event, String extra) {
        this.date = date;
        this.country = country;
        this.location = location;
        this.event = event;
        this.extra = extra;
    }


}
