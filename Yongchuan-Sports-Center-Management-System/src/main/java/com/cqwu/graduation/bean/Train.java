package com.cqwu.graduation.bean;

import java.util.Date;

public class Train {
    /* 主键 自增*/
    private Integer id;
    /* 标题 */
    private String title;
    /* 培训科目 */
    private String subject;
    /* 培训老师 */
    private String teacher;
    /* 剩余名额 */
    private Integer surplus;
    /* 名额 */
    private Integer quota;
    /* 状态 */
    private String state;
    /* 总课时 */
    private Integer totalHours;
    /* 课时时间 */
    private Integer hours;
    /* 每日课时 */
    private Integer everydayHours;
    /* 地址 */
    private String address;
    /* 详细地址 */
    private String detailedAddress;
    /* 开始时间 */
    private Date startTime;
    /* 描述 */
    private String description;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Integer getSurplus() {
        return surplus;
    }

    public void setSurplus(Integer surplus) {
        this.surplus = surplus;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(Integer totalHours) {
        this.totalHours = totalHours;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getEverydayHours() {
        return everydayHours;
    }

    public void setEverydayHours(Integer everydayHours) {
        this.everydayHours = everydayHours;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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