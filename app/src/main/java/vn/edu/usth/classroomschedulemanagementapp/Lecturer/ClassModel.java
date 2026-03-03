package vn.edu.usth.classroomschedulemanagementapp.Lecturer;

import com.google.gson.annotations.SerializedName;

public class ClassModel {
    @SerializedName("subjectName")
    private String name;
    private String roomName;
    private String startTime;
    private String endTime;
    private String major;

    public ClassModel() {}
    public ClassModel(String id, String name, String major) {
        this.name = name;
        this.major = major;
    }

    public String getName() { return name; }
    public String getRoomName() { return roomName; }
    public String getStartTime() { return startTime; }
    public String getEndTime() { return endTime; }
    public String getMajor() { return major; }

    public void setStartTime(String startTime) { this.startTime = startTime; }
    public void setEndTime(String endTime) { this.endTime = endTime; }
    public void setRoomName(String roomName) { this.roomName = roomName; }
    public String getTimeRange() {
        if (startTime == null || endTime == null) return "--:--";
        try {
            String start = startTime.contains("T") ? startTime.split("T")[1].substring(0, 5) : startTime;
            String end = endTime.contains("T") ? endTime.split("T")[1].substring(0, 5) : endTime;
            return start + " - " + end;
        } catch (Exception e) {
            return "--:--";
        }
    }
}