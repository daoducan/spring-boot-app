package com.andd.example.userprofile;

import com.andd.example.student.Student;
import jakarta.persistence.*;

@Entity
public class StudentProfile {

    @Id
    @GeneratedValue
    private Integer id;

    private String bio; //bio or description of Student
    @OneToOne
    @JoinColumn(
            name = "student_id"
    )
    private Student student;

    public StudentProfile() {
    }

    public StudentProfile(String bio) {
        this.bio = bio;
    }

    public StudentProfile(Integer id, String bio) {
        this.id = id;
        this.bio = bio;
    }
}
