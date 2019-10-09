package com.seven.security.demo.dto;

import java.io.Serializable;

public class City implements Serializable {

    private long x;
    private long y;
    private String name;
    private String desc;

    public City(long x, long y, String name, String desc) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "City{" +
                "x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
