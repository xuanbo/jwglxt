package f4.web.entity;

import java.io.Serializable;
import java.util.Date;

public class Audition implements Serializable {

    private Integer id;

    private String lesson;

    private Integer studentId;

    private Date time;

    private String address;

    private String desecration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson == null ? null : lesson.trim();
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getDesecration() {
        return desecration;
    }

    public void setDesecration(String desecration) {
        this.desecration = desecration == null ? null : desecration.trim();
    }
}