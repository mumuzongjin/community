package com.practice.community.entity;

import java.util.Date;

/**
 * @Author: Victor
 * @Date: 2020/3/4 18:28
 */
//@Getter
//@Setter
//@ToString
public class DiscussPost {
    private int id;
    private int userId;
    private String title;
    private String content;
    private int status;
    private int type;
    private Date createTime;
    private int commentCount;
    private Double score;

    @Override
    public String toString() {
        return "DiscussPost{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", status=" + status +
                ", type=" + type +
                ", createTime=" + createTime +
                ", commentCount=" + commentCount +
                ", score=" + score +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public int getUserId() {

        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getStatus() {
        return status;
    }

    public int getType() {
        return type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public Double getScore() {
        return score;
    }

    public int getId() {
        return id;
    }
}
