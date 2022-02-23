package com.blancoinfante.barna_interns.domain_obj;

public class Internship {
    public enum workType{
        VIRTUAL,
        PHYSICAL,
        DUAL
    }
    int id;
    String name;
    String description;
    double salary;
    long date_created;
    int companyId;
    workType workType;
    int duration; // Counted in number of weeks -1 for unlimited
    int vacancies;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getDate_created() {
        return date_created;
    }

    public void setDate_created(long date_created) {
        this.date_created = date_created;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Internship.workType getWorkType() {
        return workType;
    }

    public void setWorkType(Internship.workType workType) {
        this.workType = workType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getVacancies() {
        return vacancies;
    }

    public void setVacancies(int vacancies) {
        this.vacancies = vacancies;
    }

    public Internship() {
    }

    public Internship(int id, String name, String description, double salary, long date_created, int companyId,
                      Internship.workType workType, int duration, int vacancies) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.salary = salary;
        this.date_created = date_created;
        this.companyId = companyId;
        this.workType = workType;
        this.duration = duration;
        this.vacancies = vacancies;
    }
}
