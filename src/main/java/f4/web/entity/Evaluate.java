package f4.web.entity;

import java.io.Serializable;
import java.util.Date;

public class Evaluate implements Serializable {

    private Integer id;

    private String title;

    private String lessonName;

    private String tearchName;

    private Date time;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName == null ? null : lessonName.trim();
    }

    public String getTearchName() {
        return tearchName;
    }

    public void setTearchName(String tearchName) {
        this.tearchName = tearchName == null ? null : tearchName.trim();
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