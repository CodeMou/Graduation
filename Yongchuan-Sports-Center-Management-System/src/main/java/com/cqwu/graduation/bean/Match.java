package com.cqwu.graduation.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Match {
    /* 主键 */
    private Integer id;
    /* 赛事名称 */
    private String name;
    /* 科目名称 */
    private String subject;
    /* 科目类别 */
    private String category;
    /* 现有人数 */
    private Integer numberNow;
    /* 总人数*/
    private Integer number;
    /* 组织者 */
    private String organizer;
    /* 科目开始时间 */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date subjectTimeStart;
    /* 科目结束时间 */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date subjectTimeEnd;
    /* 比赛开始时间 */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date matchTimeStart;
    /* 比赛结束时间 */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date matchTimeEnd;
    /* 新增时间 */
    private Date rawAddTime;
    /* 修改时间 */
    private Date rawUpdateTime;
    /* 描述 */
    private String description;
    /* 状态 */
	private String state;

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
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getNumberNow() {
        return numberNow;
    }

    public void setNumberNow(Integer numberNow) {
        this.numberNow = numberNow;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public Date getSubjectTimeStart() {
        return subjectTimeStart;
    }

    public void setSubjectTimeStart(Date subjectTimeStart) {
        this.subjectTimeStart = subjectTimeStart;
    }

    public Date getSubjectTimeEnd() {
        return subjectTimeEnd;
    }

    public void setSubjectTimeEnd(Date subjectTimeEnd) {
        this.subjectTimeEnd = subjectTimeEnd;
    }

    public Date getMatchTimeStart() {
        return matchTimeStart;
    }

    public void setMatchTimeStart(Date matchTimeStart) {
        this.matchTimeStart = matchTimeStart;
    }

    public Date getMatchTimeEnd() {
        return matchTimeEnd;
    }

    public void setMatchTimeEnd(Date matchTimeEnd) {
        this.matchTimeEnd = matchTimeEnd;
    }

    public Date getRawAddTime() {
        return rawAddTime;
    }

    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}