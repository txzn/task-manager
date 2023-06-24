package com.task.entity;

import java.util.Date;

/**
 * 任务类
 * 任务的基本行为
 *
 * @author Minghua Liang
 */
public class Task {

    private String title;

    private String describe;

    private Date createTime;

    private Integer priority;

    public Integer getGroupingId() {
        return groupingId;
    }

    public void setGroupingId(Integer groupingId) {
        this.groupingId = groupingId;
    }

    private Integer groupingId;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", describe='" + describe + '\'' +
                ", createTime=" + createTime +
                ", priority=" + priority +
                ", groupingId=" + groupingId +
                '}';
    }
}
