package com.mukesh.project.com.mukesh.project.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mukesh.project.bo.Student;
import com.mukesh.project.inter.Registrar;
import com.mukesh.project.inter.StudentStore;

@Singleton
public class LenientRegistrar implements Registrar {
    private final StudentStore studentStore;

    @Inject
    public LenientRegistrar(StudentStore studentStore) {
        this.studentStore = studentStore;
    }

    public boolean checkStudentStatus(Integer studentId) {
        boolean status = false;

        Student student = studentStore.load(studentId);

        if (student != null && student.getCredits() != null) {
            status = student.getCredits() >= 10.0;
        }
        return status;

    }

    public Student registerStudent(String name, Integer credits) {
        Student s = new Student();
        s.setName(name);
        s.setCredits(credits);
        return studentStore.save(s);
    }
}
