package com.imooc.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "car_statuses")
public class CarStatuses {
    @Id
    private Integer id;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "car_no")
    private String carNo;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "last_in_time")
    private Date lastInTime;

    @Column(name = "last_out_time")
    private Date lastOutTime;

    @Column(name = "visit_count")
    private Integer visitCount;

    private Byte status;

    @Column(name = "last_group_id")
    private String lastGroupId;

    @Column(name = "last_floor")
    private String lastFloor;

    @Column(name = "last_position_x")
    private Integer lastPositionX;

    @Column(name = "last_position_y")
    private Integer lastPositionY;

    @Column(name = "last_node_id")
    private String lastNodeId;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "velocity_x")
    private Double velocityX;

    @Column(name = "velocity_y")
    private Double velocityY;

    @Column(name = "velocity_ts")
    private Long velocityTs;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return created_at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return updated_at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return car_no
     */
    public String getCarNo() {
        return carNo;
    }

    /**
     * @param carNo
     */
    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return last_in_time
     */
    public Date getLastInTime() {
        return lastInTime;
    }

    /**
     * @param lastInTime
     */
    public void setLastInTime(Date lastInTime) {
        this.lastInTime = lastInTime;
    }

    /**
     * @return last_out_time
     */
    public Date getLastOutTime() {
        return lastOutTime;
    }

    /**
     * @param lastOutTime
     */
    public void setLastOutTime(Date lastOutTime) {
        this.lastOutTime = lastOutTime;
    }

    /**
     * @return visit_count
     */
    public Integer getVisitCount() {
        return visitCount;
    }

    /**
     * @param visitCount
     */
    public void setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
    }

    /**
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return last_group_id
     */
    public String getLastGroupId() {
        return lastGroupId;
    }

    /**
     * @param lastGroupId
     */
    public void setLastGroupId(String lastGroupId) {
        this.lastGroupId = lastGroupId;
    }

    /**
     * @return last_floor
     */
    public String getLastFloor() {
        return lastFloor;
    }

    /**
     * @param lastFloor
     */
    public void setLastFloor(String lastFloor) {
        this.lastFloor = lastFloor;
    }

    /**
     * @return last_position_x
     */
    public Integer getLastPositionX() {
        return lastPositionX;
    }

    /**
     * @param lastPositionX
     */
    public void setLastPositionX(Integer lastPositionX) {
        this.lastPositionX = lastPositionX;
    }

    /**
     * @return last_position_y
     */
    public Integer getLastPositionY() {
        return lastPositionY;
    }

    /**
     * @param lastPositionY
     */
    public void setLastPositionY(Integer lastPositionY) {
        this.lastPositionY = lastPositionY;
    }

    /**
     * @return last_node_id
     */
    public String getLastNodeId() {
        return lastNodeId;
    }

    /**
     * @param lastNodeId
     */
    public void setLastNodeId(String lastNodeId) {
        this.lastNodeId = lastNodeId;
    }

    /**
     * @return image_url
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * @param imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * @return velocity_x
     */
    public Double getVelocityX() {
        return velocityX;
    }

    /**
     * @param velocityX
     */
    public void setVelocityX(Double velocityX) {
        this.velocityX = velocityX;
    }

    /**
     * @return velocity_y
     */
    public Double getVelocityY() {
        return velocityY;
    }

    /**
     * @param velocityY
     */
    public void setVelocityY(Double velocityY) {
        this.velocityY = velocityY;
    }

    /**
     * @return velocity_ts
     */
    public Long getVelocityTs() {
        return velocityTs;
    }

    /**
     * @param velocityTs
     */
    public void setVelocityTs(Long velocityTs) {
        this.velocityTs = velocityTs;
    }
}