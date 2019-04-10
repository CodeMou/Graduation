package com.cqwu.graduation.bean;

import java.util.Date;

public class Enroll {
    /* 主键 自增 */
    private Integer id;
    /* 用户名 */
    private String username;
    /* 报名比赛的Id */
    private Integer entryMatchId;
    /* 比赛的状态 */
    private String matchState;
    /* 参与培训的Id*/
    private Integer entrySubjectId;
    /* 培训的状态 */
    private String subjectState;
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