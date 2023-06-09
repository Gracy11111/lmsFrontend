package com.example.learningmanagementsystem.model;

import jakarta.persistence.*;
@Entity
@Table(name = "enrollment")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "enrollId")
    private int enrollId;

    @ManyToOne
    @JoinColumn(name = "studentId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;

    public int getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(int enrollId) {
        this.enrollId = enrollId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Enrollment(int enrollId, User user, Course course) {

        this.enrollId = enrollId;
        this.user = user;
        this.course = course;
    }

    public Enrollment() {
        super();
    }


    @Override
    public String toString() {
        return "Enrollment{" +
                "enrollId=" + enrollId +
                ", user=" + user +
                ", course=" + course +
                '}';
    }
}