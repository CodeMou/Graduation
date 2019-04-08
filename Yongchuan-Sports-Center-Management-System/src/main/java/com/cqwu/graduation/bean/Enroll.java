package com.cqwu.graduation.bean;

import java.util.Date;

public class Enroll {
    /* 主键 */
    private Integer id;
    /* 用户名 */
    private String username;
    /* 参与比赛的Id */
    private Integer entryMatchId;
    /* 比赛的状态 */
    private String matchState;
    /* 参加培训的id */
    private Integer entrySubjectId;
    /* 培训的状态 */
    private String subjectState;
    /* 预约的场地名 */
    private String entryFieldName;
    /* 场地的状态 */
    private String fieldState;
    /* 预约开始时间 */
    private String appointStartTime;
    /* 预约结束时间 */
    private String appointEndTime;
    /* 新增时间 */
    private Date rawAddTime;
    /* 修改时间 */
    private Date rawUpdateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getEntryMatchId() {
        return entryMatchId;
    }

    public void setEntryMatchId(Integer entryMatchId) {
        this.entryMatchId = entryMatchId;
    }

    public String getMatchState() {
        return matchState;
    }

    public void setMatchState(String matchState) {
        this.matchState = matchState;
    }

    public Integer getEntrySubjectId() {
        return entrySubjectId;
    }

    public void setEntrySubjectId(Integer entrySubjectId) {
        this.entrySubjectId = entrySubjectId;
    }

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }

    public String getEntryFieldName() {
        return entryFieldName;
    }

    public void setEntryFieldName(String entryFieldName) {
        this.entryFieldName = entryFieldName;
    }

    public String getFieldState() {
        return fieldState;
    }

    public void setFieldState(String fieldState) {
        this.fieldState = fieldState;
    }

    public String getAppointStartTime() {
        return appointStartTime;
    }

    public void setAppointStartTime(String appointStartTime) {
        this.appointStartTime = appointStartTime;
    }

    public String getAppointEndTime() {
        return appointEndTime;
    }

    public void setAppointEndTime(String appointEndTime) {
        this.appointEndTime = appointEndTime;
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
}