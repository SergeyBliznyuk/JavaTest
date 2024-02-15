package com.Project1;

import java.io.Serializable;

public class Course implements Serializable {
    private int id;
    private transient String title;

    public Course() {}

    public Course(int id, String title) {
        this.id =id;
        this.title = title;
    }

    @Override
    public String toString() {
        return String.valueOf(id) + " " + title;
    }

    @Override
    public boolean equals(Object obj) {
        Course course = (Course) obj;
        return id == course.id;
    }
}
