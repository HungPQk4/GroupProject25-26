package vn.edu.usth.classroomschedulemanagementapp.Lecturer;

import com.google.gson.annotations.SerializedName;

public class StudentInfo {

    @SerializedName("id")
    private String id;

    @SerializedName("fullName")
    private String fullName;

    @SerializedName("studentCode")
    private String studentCode;

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getStudentCode() {
        return studentCode;
    }
}
