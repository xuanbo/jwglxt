package f4.web.entity;

import java.io.Serializable;
import java.util.Date;

public class Sellactivity implements Serializable {

    private Integer id;

    private String name;

    private Date startTime;

    private String state;

    private Date endTime;

    private String type;

    private Double budgetCost;

    private Double actualCost;

    private String reaction;

    private Integer expectStudentNum;

    private String description;

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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Double getBudgetCost() {
        return budgetCost;
    }

    public void setBudgetCost(Double budgetCost) {
        this.budgetCost = budgetCost;
    }

    public Double getActualCost() {
        return actualCost;
    }

    public void setActualCost(Double actualCost) {
        this.actualCost = actualCost;
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction == null ? null : reaction.trim();
    }

    public Integer getExpectStudentNum() {
        return expectStudentNum;
    }

    public void setExpectStudentNum(Integer expectStudentNum) {
        this.expectStudentNum = expectStudentNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}