package f4.web.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "audition")
public class Audition implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String lesson;

    @Column
    private Integer studentId;

    @Column
    private Date time;

    @Column
    private String address;

    @Column
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