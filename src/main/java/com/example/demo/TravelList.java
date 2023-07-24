package com.example.demo;

public class TravelList {
    private Integer userId;

    private String name;

    private String placeName;

    private String timeLine;

    private int priorityNo;

    private String coPassengerName;



    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getTimeLine() {
        return timeLine;
    }

    public void setTimeLine(String timeLine) {
        this.timeLine = timeLine;
    }

    public int getPriorityNo() {
        return priorityNo;
    }

    public void setPriorityNo(int priorityNo) {
        this.priorityNo = priorityNo;
    }

    public String getCoPassengerName() {
        return coPassengerName;
    }

    public void setCoPassengerName(String coPassengerName) {
        this.coPassengerName = coPassengerName;
    }
}
