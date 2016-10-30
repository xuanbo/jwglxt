package f4.web.entity;

import java.io.Serializable;
import java.util.Date;

public class Score implements Serializable {

    private Integer id;

    private Integer studentId;

    private String lessonName;

    private Double socre;

    private Date time;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName == null ? null : lessonName.trim();
    }

    public Double getSocre() {
        return socre;
    }

    public void setSocre(Double socre) {
        this.socre = socre;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}