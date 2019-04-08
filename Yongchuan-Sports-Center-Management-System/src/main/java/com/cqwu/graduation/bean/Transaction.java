package com.cqwu.graduation.bean;

import java.util.Date;

public class Transaction {
    /* 主键 自增*/
    private Integer id;
    /* 商品id */
    private Integer commodityId;
    /* 商品名 */
    private String commodityName;
    /* 单价 */
    private Long univalence;
    /* 数量 */
    private Integer number;
    /* 总价 */
    private Long totalPrice;
    /* 用户 */
    private String payer;
    /* 分区 */
    private String partition;
    /* 新增时间*/
    private Date rawAddTime;
    /* 更新时间*/
    private Date rawUpdateTime;
    /* 状态 */
    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Long getUnivalence() {
        return univalence;
    }

    public void setUnivalence(Long univalence) {
        this.univalence = univalence;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getPartition() {
        return partition;
    }

    public void setPartition(String partition) {
        this.partition = partition;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}