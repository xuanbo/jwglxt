package f4.web.entity;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {

    private Integer id;

    private String from;

    private Date time;

    private String to;

    private Integer phone;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to == null ? null : to.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}