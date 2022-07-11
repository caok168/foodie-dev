package com.imooc.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "lock_lots")
public class LockLots {
    @Id
    private Integer id;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "lot_id")
    private String lotId;

    private String floor;

    @Column(name = "bt_addr")
    private String btAddr;

    private Byte status;

    @Column(name = "up_command")
    private String upCommand;

    @Column(name = "lock_type")
    private Integer lockType;

    @Column(name = "down_command")
    private String downCommand;

    @Column(name = "status_command")
    private String statusCommand;

    private Byte deleted;

    @Column(name = "safe_radius_px")
    private Integer safeRadiusPx;

    @Column(name = "leave_radius_px")
    private Integer leaveRadiusPx;

    @Column(name = "router_ip")
    private String routerIp;

    @Column(name = "sleep_time")
    private Integer sleepTime;

    @Column(name = "lock_keys")
    private String lockKeys;

    private String name;

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
     * @return deleted_at
     */
    public Date getDeletedAt() {
        return deletedAt;
    }

    /**
     * @param deletedAt
     */
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * @return lot_id
     */
    public String getLotId() {
        return lotId;
    }

    /**
     * @param lotId
     */
    public void setLotId(String lotId) {
        this.lotId = lotId;
    }

    /**
     * @return floor
     */
    public String getFloor() {
        return floor;
    }

    /**
     * @param floor
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }

    /**
     * @return bt_addr
     */
    public String getBtAddr() {
        return btAddr;
    }

    /**
     * @param btAddr
     */
    public void setBtAddr(String btAddr) {
        this.btAddr = btAddr;
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
     * @return up_command
     */
    public String getUpCommand() {
        return upCommand;
    }

    /**
     * @param upCommand
     */
    public void setUpCommand(String upCommand) {
        this.upCommand = upCommand;
    }

    /**
     * @return lock_type
     */
    public Integer getLockType() {
        return lockType;
    }

    /**
     * @param lockType
     */
    public void setLockType(Integer lockType) {
        this.lockType = lockType;
    }

    /**
     * @return down_command
     */
    public String getDownCommand() {
        return downCommand;
    }

    /**
     * @param downCommand
     */
    public void setDownCommand(String downCommand) {
        this.downCommand = downCommand;
    }

    /**
     * @return status_command
     */
    public String getStatusCommand() {
        return statusCommand;
    }

    /**
     * @param statusCommand
     */
    public void setStatusCommand(String statusCommand) {
        this.statusCommand = statusCommand;
    }

    /**
     * @return deleted
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    /**
     * @return safe_radius_px
     */
    public Integer getSafeRadiusPx() {
        return safeRadiusPx;
    }

    /**
     * @param safeRadiusPx
     */
    public void setSafeRadiusPx(Integer safeRadiusPx) {
        this.safeRadiusPx = safeRadiusPx;
    }

    /**
     * @return leave_radius_px
     */
    public Integer getLeaveRadiusPx() {
        return leaveRadiusPx;
    }

    /**
     * @param leaveRadiusPx
     */
    public void setLeaveRadiusPx(Integer leaveRadiusPx) {
        this.leaveRadiusPx = leaveRadiusPx;
    }

    /**
     * @return router_ip
     */
    public String getRouterIp() {
        return routerIp;
    }

    /**
     * @param routerIp
     */
    public void setRouterIp(String routerIp) {
        this.routerIp = routerIp;
    }

    /**
     * @return sleep_time
     */
    public Integer getSleepTime() {
        return sleepTime;
    }

    /**
     * @param sleepTime
     */
    public void setSleepTime(Integer sleepTime) {
        this.sleepTime = sleepTime;
    }

    /**
     * @return lock_keys
     */
    public String getLockKeys() {
        return lockKeys;
    }

    /**
     * @param lockKeys
     */
    public void setLockKeys(String lockKeys) {
        this.lockKeys = lockKeys;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}