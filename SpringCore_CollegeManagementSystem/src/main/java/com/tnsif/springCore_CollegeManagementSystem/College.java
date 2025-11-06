package com.tnsif.springCore_CollegeManagementSystem;

import java.util.List;

public class College {
    private String collegeName;
    private List<Department> departments;

    public College() {
    }

    public College(String collegeName, List<Department> departments) {
        this.collegeName = collegeName;
        this.departments = departments;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "College Name: " + collegeName + "\nDepartments: " + departments;
    }
}
