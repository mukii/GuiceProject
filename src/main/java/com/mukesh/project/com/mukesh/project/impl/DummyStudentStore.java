package com.mukesh.project.com.mukesh.project.impl;

import java.util.HashMap;
import java.util.Map;

import com.google.inject.Singleton;
import com.mukesh.project.bo.Student;
import com.mukesh.project.inter.StudentStore;

@Singleton
public class DummyStudentStore implements StudentStore {
    private final Map<Integer, Student> studentMap;

    public DummyStudentStore() {
        studentMap = new HashMap<Integer, Student>();
    }

    public boolean exists(Integer id) {
        return studentMap.containsKey(id);
    }

    public Student load(Integer id) {
        Student s = studentMap.get(id);
        return s;
    }

    public Student save(Student p) {
        if (p.getId() == null) {
            p.setId(studentMap.size() + 1);
        }
        studentMap.put(p.getId(), p);
        return p;
    }

}
