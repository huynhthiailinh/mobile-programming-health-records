package com.example.healthrecords.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class HealthRecord {
    @SerializedName("id")
    private String id;

    @SerializedName("date")
    private Date date;

    @SerializedName("key")
    private String key;

    @SerializedName("value")
    private int value;

    public HealthRecord(String id, Date date, String key, int value) {
        this.id = id;
        this.date = date;
        this.key = key;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
