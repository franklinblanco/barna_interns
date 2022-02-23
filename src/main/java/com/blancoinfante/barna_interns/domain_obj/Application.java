package com.blancoinfante.barna_interns.domain_obj;

public class Application {
    public enum Status{
        ACCEPTED,
        DENIED,
        SUBMITTED
    }
    int id;
    int internshipId;
    int studentId;
    Status status;
    String notes;
    long date_created;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInternshipId() {
        return internshipId;
    }

    public void setInternshipId(int internshipId) {
        this.internshipId = internshipId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public long getDate_created() {
        return date_created;
    }

    public void setDate_created(long date_created) {
        this.date_created = date_created;
    }

    public Application() {
    }

    public Application(int id, int internshipId, int studentId, Status status, String notes, long date_created) {
        this.id = id;
        this.internshipId = internshipId;
        this.studentId = studentId;
        this.status = status;
        this.notes = notes;
        this.date_created = date_created;
    }
}
