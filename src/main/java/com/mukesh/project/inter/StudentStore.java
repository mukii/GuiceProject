package com.mukesh.project.inter;

import com.mukesh.project.bo.Student;

public interface StudentStore {

    public boolean exists(Integer id);

    public Student load(Integer id);

    public Student save(Student p);
}
