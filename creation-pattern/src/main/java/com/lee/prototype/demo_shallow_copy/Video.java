package com.lee.prototype.demo_shallow_copy;


import java.util.Date;
import java.util.Objects;

/**
 * 原型模式很简单，实现Cloneable接口即可
 * 当前示例为浅拷贝
 */
public class Video implements Cloneable{
    private Date createDate;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Video(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Video{" +
                "createDate=" + createDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return Objects.equals(createDate, video.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createDate);
    }
}
