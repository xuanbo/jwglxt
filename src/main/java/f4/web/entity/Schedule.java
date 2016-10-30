package f4.web.entity;

import java.io.Serializable;

public class Schedule implements Serializable {

    private Integer id;

    private String name;

    private String monday;

    private String tuesday;

    private String wednesday;

    private String thursday;

    private String friday;

    private String saturday;

    private String sunday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        this.monday = monday == null ? null : monday.trim();
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday == null ? null : tuesday.trim();
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday == null ? null : wednesday.trim();
    }

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday == null ? null : thursday.trim();
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday == null ? null : friday.trim();
    }

    public String getSaturday() {
        return saturday;
    }

    public void setSaturday(String saturday) {
        this.saturday = saturday == null ? null : saturday.trim();
    }

    public String getSunday() {
        return sunday;
    }

    public void setSunday(String sunday) {
        this.sunday = sunday == null ? null : sunday.trim();
    }
}