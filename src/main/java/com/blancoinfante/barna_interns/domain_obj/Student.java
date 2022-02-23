package com.blancoinfante.barna_interns.domain_obj;

public class Student {
    int id;
    String name;
    long date_of_birth;
    String institutional_id;
    long date_created;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(long date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getInstitutional_id() {
        return institutional_id;
    }

    public void setInstitutional_id(String institutional_id) {
        this.institutional_id = institutional_id;
    }

    public long getDate_created() {
        return date_created;
    }

    public void setDate_created(long date_created) {
        this.date_created = date_created;
    }

    public Student() {
    }

    public Student(int id, String name, long date_of_birth, String institutional_id, long date_created) {
        this.id = id;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.institutional_id = institutional_id;
        this.date_created = date_created;
    }
}
