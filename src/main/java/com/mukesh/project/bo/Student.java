package com.mukesh.project.bo;

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String name;
    private Integer credits;
    private Boolean registered;
    private String major;
    private Integer year;
}
