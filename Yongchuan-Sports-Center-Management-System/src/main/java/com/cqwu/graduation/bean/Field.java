package com.cqwu.graduation.bean;

import java.util.Date;

public class Field {
    /* 主键，自增 */
    private Integer id;
    /* 场地名 */
    private String name;
    /* 容纳人数 */
    private Integer number;
    /* 目前人数 */
    private Integer numberNow;
    /* 开始时间 */
    private String openTimeStart;
    /* 结束时间 */
    private String openTimeEnd;
    /* 新增时间 */
    private Date rawAddTime;
    /* 更改时间 */
    private Date rawUpdateTime;

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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumberNow() {
        return numberNow;
    }

    public void setNumberNow(Integer numberNow) {
        this.numberNow = numberNow;
    }

    public String getOpenTimeStart() {
        return openTimeStart;
    }

    public void setOpenTimeStart(String openTimeStart) {
        this.openTimeStart = openTimeStart;
    }

    public String getOpenTimeEnd() {
        return openTimeEnd;
    }

    public void setOpenTimeEnd(String openTimeEnd) {
        this.openTimeEnd = openTimeEnd;
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