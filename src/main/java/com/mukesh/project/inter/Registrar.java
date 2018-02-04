package com.mukesh.project.inter;

import com.mukesh.project.bo.Student;

public interface Registrar {
    public boolean checkStudentStatus(Integer studentId);

    public Student registerStudent(String name, Integer credits);
}
